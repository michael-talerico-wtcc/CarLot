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
    //Reference for Prepared Statement
    //Reference for Select all SalesOrder SQL Statement (Will need to join with car table to get all info)
    //Reference for Insert SalesOrder SQL Statement
    
    
    //GET Sales ORDERS
    //public static ObservableList<SalesOrder> getAllSalesOrderes() throws 
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
    
    
   //ADD SALES ORDER
   // public static void addSalesOrder(SalesOrder salesOrder) throws SQLException, ClassNotFoundException{
    
        //try{
            
            //Set up Connection
           
            
            //Create Prepared Statement
           
            
            //Update Prepared Statement
                // When updating the preparedStatement with the datePurchased you use the following format
                // preparedStatement.setString(2, Date.valueOf(purchaseOrder.getDatePurchased()) + "");
        
            //Run Update
            
        
        //}catch(SQLException e){
             
        //}
   
    //}
    
    
    //Use ResultSet of 'GET ALL SALES ORDERS' to create and return list of sales orders
     //private static ObservableList<SalesOrder> createSalesOrderFromResultSet(ResultSet resultSet) 
            //throws SQLException, ClassNotFoundException {
        
        //Create ObservableList
        
        
        //Loop through ResultSet and create local variables:
        //int id, dateSold (see note below on how to do this one), double priceSold,
            //vin, make, model, color, int mileage, int mpg, double salesPrice
                //What to do to convert SQL date in Result Date to LocalDate 
                //LocalDate dateSold = resultSet.getDate("dateSold").toLocalDate();
            
            //Create car with local variables 
                //constructor: Car(vin, year, make model, color, mileage, mpg, salesPrice) 
    
            //Create SalesOrder with the created car and rest of the variables
                //constructor: SalesOrder(id, dateSold, car, priceSold)
    
            //Add SalesOrder To List
        
     
        //Return List
        
    //}
        
    
}
