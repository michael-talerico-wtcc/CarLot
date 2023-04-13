/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import carlot.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import models.Car;

/**
 *
 * @author AlexC
 */
public class CarDAO {
    
    public static ObservableList<Car> getAllCars() throws 
            SQLException, ClassNotFoundException {
        
        // Declare SELECT statement!!!!!!!!!!!!!Need to update when Purchase Orders in DB
        String selectStmt = "SELECT * FROM car;";
        
        //Execute SELECT statement
        try{
            //Get ResultSet from dbExecuteQuery method
            ResultSet resultSet = DBConnection.dbExecuteQuery(selectStmt);
            
            //Get list of ResultSet data
            ObservableList<Car> carList = createCarListFromResultSet(resultSet);
            
            // Return list
            return carList;
            
        }catch (SQLException e){
            System.out.println("SQL select operation has failed: " + e);
            //Return exception
            throw e;
        }
    }
    
    // UPDATE A CAR
    public static void updateCar(Car car)throws 
            SQLException, ClassNotFoundException {
        
        //Declare an UPDATE statement
        String updateStmt = String.format("UPDATE car SET year = %d, make = '%s', "
                + "model = '%s', color = '%s', "
                + "mileage = %d, mpg = %d, "
                + "salesPrice = %f WHERE vin = '%s';", 
                 car.getYear(), car.getMake(), car.getModel(), 
                 car.getColor(), car.getMileage(), car.getMpg(), 
                 car.getSalesPrice(), car.getVin()); 
        
        try{
            // Execute UPDATE statement
            DBConnection.dbExecuteUpdate(updateStmt);
            
        } catch (SQLException e){
            System.out.println("Received Error when attempting to update car with vin " +
                    car.getVin() + " " + e);
            
            //Return exception
            throw e;
        }
        
    }
        
    //Use ResultSet to create and return list of cars
    private static ObservableList<Car> createCarListFromResultSet(ResultSet resultSet) 
            throws SQLException, ClassNotFoundException {
        
        //Create ObservableList
        ObservableList<Car> carList = FXCollections.observableArrayList();
        
        //Loop through the result set to get all the values
        while (resultSet.next()){ 
            String vin = resultSet.getString("vin");
            int year = resultSet.getInt("year");
            String make = resultSet.getString("make");
            String model = resultSet.getString("model");
            String color = resultSet.getString("color");
            int mileage = resultSet.getInt("mileage");
            int mpg = resultSet.getInt("mpg");
            double salesPrice = resultSet.getDouble("salesPrice");
            
            //Create Car
            Car car = new Car(vin, year, make, model, color, mileage, mpg, salesPrice);
            
            //Add car to list
            carList.add(car);
        }
        //Return the list
        return carList;
    }
}
