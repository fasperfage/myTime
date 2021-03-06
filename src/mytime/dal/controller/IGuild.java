/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytime.dal.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import mytime.be.Group;
import mytime.be.Location;

/**
 *
 * @author Bruger
 */
public interface IGuild
{
    public void createGuild(String name, String location) throws SQLException;
    
    public List<Location> getAllLocations() throws SQLException;
    
    public List<Group> getAMembersGuildsAtLocation(int volunteerid, int locationid) throws SQLException;
    
    public List<Integer> getArrayOfAvailableGuildsForVolunteer(int volunteerid) throws SQLException;
    
    public List<Group> getAllGroupsForPerson(int volunteerid) throws SQLException;
    
}
