/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import carlot.DBConnection;
import java.sql.SQLException;
import javafx.collections.ObservableList;
import models.PurchaseOrder;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import java.sql.Date;
import models.Car;

/**
 *
 * @author AlexC
 */
public class PurchaseOrderDAO {
    //Reference for Prepared Statement
    //Reference for Get all Purchase Orders SQL statement (will need to join with car table to get all needed info)
    //Reference for Insert Purchase Order Stmt
    
   //GET PURCHASE ORDERS
    //public static ObservableList<Car> getAllCars() throws 
            //SQLException, ClassNotFoundException {
        
        //try{
            
            //Set up Connection
            
            
            //Create Prepared Statement
           
            
           //Get ResultSet from executeQuery method
            
            
            //Create ObservableList from ResultSet data
            
            
            //Return list
            
        //}catch (SQLException e){
           
            //Throw exception
            
        //}
    //}
   
    
    //ADD PURCHASE ORDER
    
        //Set up Connection
    
        //Create Prepared Statement
    
        //Update Prepared Statement
            // When updating the preparedStatement with the datePurchased you the following format
            // preparedStatement.setString(2, Date.valueOf(purchaseOrder.getDatePurchased()) + "");
    
        //Run Update

    //Use ResultSet from 'GET PURCHASE ORDERS' to create and return list of purachaseOrders 
     
        //Create List
    
        //Loop through resultSet and assignment attributes to local variables: 
            // int id, datePurchased (see note below on how to do that one), cost, vin
            // int year, make, model, color, int mileage, int mpg, double salesPrice
                //What to do to convert SQL date in Result Date to LocalDate 
                //LocalDate datePurchased = resultSet.getDate("datePurchased").toLocalDate();
    
            //Create car with local variables 
                //constructor: Car(vin, year, make model, color, mileage, mpg, salesPrice) 
    
            //Create purchaseOrder with the created car and rest of the variables
                //constructor: PurchaseOrder(id, datePurchased, car, cost)
    
            //Add PurchaseOrder To List
    
            
        //Return list
    
    
    }
    
       
    
    
    
    
