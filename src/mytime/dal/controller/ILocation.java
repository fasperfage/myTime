/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytime.dal.controller;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.SQLException;
import java.util.List;
import mytime.be.Location;

/**
 *
 * @author Stefan-VpcEB3J1E
 */
public interface ILocation
{
   public Location getSelectedLocation(Location location) throws SQLException; 
}
