/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import java.sql.SQLException;
import javafx.collections.ObservableList;
import models.PurchaseOrder;
import models.SalesOrder;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.sql.Date;
import javafx.collections.FXCollections;


/**
 *
 * @author AlexC
 */
public class SalesOrderDAO {
    //Attribute Prepared Statement
    //Attribute Select all SalesOrder SQL Statement (Will need to join with car table to get all info)
    //Attribute Insert SalesOrder SQL Statement
    
    
    //GET ALL SALES ORDERS
    
        //Set up Connection
    
        //Create Prepared Statement
    
        //Get ResultSet from executeQuery method
    
        //Create List from ResultSet data
    
        //Return List
    
    
    //ADD SALES ORDER
    
        //Set up Connection
    
        //Create Prepared Statement
    
        //Update Prepared Statement
            //When updating dateSold use the following
            //preparedStatement.setString(2, Date.valueOf(salesOrder.getDateSold()) + "");
        
        //Run update
    
    
    //Use ResultSet of 'GET ALL SALES ORDERS' to create and return list of sales orders
    
        //CreateList
    
        //Loop through resultSet and assignment attributes to local variables
            //To convert SQL's date to LocalDate for variable
            //LocalDate dateSold = resultSet.getDate("dateSold").toLocalDate();
        
            //Create Car with local Variables
    
            //Create SalesOrder with car and other needed variables
    
            //Add SalesOrder to List
    
        //Return List
    
    
    
}
