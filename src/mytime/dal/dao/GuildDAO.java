/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytime.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mytime.be.Location;

/**
 *
 * @author Bruger
 */
public class GuildDAO
{
    
    /**
     * Creates and adds a new guild to the database
     * @param c
     * @param name
     * @param location
     * @throws SQLException 
     */
    public void createGuild(Connection c, String name, String location) throws SQLException
    {
        System.out.println("Guild: ( " + name + ") created!");

        try (Connection con = c)
        {
            String sql = "INSERT INTO Guild(name, location)"
                    + "VALUES(?, ?)";
            
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, location);
            ps.executeUpdate();

        }

    }
    
    
    /**
     * Returns a list of all locations stored in database
     * @return 
     */
    public List<Location> getAllLocations(Connection c) throws SQLException
    {
        List<Location> locations = new ArrayList();
        
        try(Connection con = c)
        {
            String sql = "SELECT *FROM Location";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
                String name = rs.getString("name");
                int id = rs.getInt("id");
                
                Location location = new Location(name, id);
                locations.add(location);
            }           
        }
        return locations;
        
    }
    
}
