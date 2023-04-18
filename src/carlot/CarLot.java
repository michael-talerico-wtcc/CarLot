/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package carlot;

import daos.CarDAO;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import models.Car;
import views.car.CarTable;
import views.car.CarView;
import views.purchaseOrder.PurchaseOrderView;
import views.salesOrder.SalesOrderView;

/**
 *
 * @author AlexC
 */
public class CarLot extends Application {
    private CarView carView;
    private PurchaseOrderView purchaseOrderView;
    private SalesOrderView salesOrderView;
    
    @Override
    public void start(Stage primaryStage) {
        
        //Create Root Pane
        TabPane root = new TabPane();
        
        //Create Tabs
        Tab carTab = new Tab("Inventory");
        Tab purchaseOrderTab = new Tab("Purchases");
        Tab salesOrderTab = new Tab("Sales");
        
        //Create New Views 
        carView = new CarView();
        purchaseOrderView = new PurchaseOrderView();
        salesOrderView = new SalesOrderView();
        
        //Add Views to Tabs as Content
        carTab.setContent(carView);
        purchaseOrderTab.setContent(purchaseOrderView);
        salesOrderTab.setContent(salesOrderView);
        
        //Add Tabs to Root Pane
        root.getTabs().addAll(carTab, purchaseOrderTab, salesOrderTab);
        
        //Root Styling
        root.setTabMinWidth(100);
        root.setTabMaxWidth(100);
        root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("CarLot");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
         /**
         * POPULATE TABLES WITH DATA
         */
         
        this.populateCarTable();
        //this.populatePurchaseOrderTable();
        //this.populateSalesOrderTable();
        
        
         /**
         * EVENTS
         */
        
         //Inventory Tab Clicked
        carTab.selectedProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue){
                populateCarTable();
            }
        });


        // Car Table Row Clicked
        carView.getCarTable().getTable().setOnMouseClicked(e -> {
            // Display attributes of car whose table row was selected in textfields
            this.populateCarTextFieldsWithSelectionData();
        });  
        
        // Car Update Button Clicked
        carView.getUpdateBtn().setOnAction(e -> {
            
            // Uses textfield input to update Car in db
            Car car = createCarFromTextFieldInput();
            
            //Use data to update car in db
            updateCar(car);
            
            //Clear textfields
            clearCarFormTextFields();
            
            //Refresh car table
            populateCarTable();
        });  
        
        //Car Cancel Button Clicked
        carView.getCancelBtn().setOnAction(e -> clearCarFormTextFields());
        
    }
    
     /**
     * METHODS
     */
    
    //CAR TABLE RELATED
    private void populateCarTable(){
        try{
            //Use CarDAO to get list of cars from db
            carView.getCarTable().getTable().setItems(CarDAO.getAllCars());
            
        } catch(SQLException | ClassNotFoundException e) {
            System.out.println("Error populating table with car data for db.\n" + e);
        }
    }
    
    private void populateCarTextFieldsWithSelectionData(){
        //Get car that was selected 
        Car car = carView.getCarTable().getTable().getSelectionModel().getSelectedItem();
        
        //Get attributes of selected car and set as text for car form textfields
        carView.getCarForm().getVin().setText(car.getVin());
        carView.getCarForm().getMake().setText(car.getMake());
        carView.getCarForm().getModel().setText(car.getModel());
        carView.getCarForm().getColor().setText(car.getColor());
        
        // Add +"" to setText() argument to convert the resulting number to a string
        carView.getCarForm().getYear().setText(car.getYear()+ "");
        carView.getCarForm().getMileage().setText(car.getMileage()+ "");
        carView.getCarForm().getMpg().setText(car.getMpg()+"");
        carView.getCarForm().getSalesPrice().setText(car.getSalesPrice()+"");
    }
    
     private Car createCarFromTextFieldInput(){
        //Get each car attribute value from the car form textfields
        String vin = carView.getCarForm().getVin().getText();
        String make = carView.getCarForm().getMake().getText();
        String model = carView.getCarForm().getModel().getText();
        String color = carView.getCarForm().getColor().getText();
        int year =  Integer.parseInt(carView.getCarForm().getYear().getText());
        int mileage = Integer.parseInt(carView.getCarForm().getMileage().getText()); 
        int mpg = Integer.parseInt(carView.getCarForm().getMpg().getText());
        double salesPrice = Double.parseDouble(carView.getCarForm().getSalesPrice().getText());
               
        Car car = new Car(vin, year, make, model, color, mileage, mpg, salesPrice);
        return car;
    }
    
    // Update Car
    private void updateCar(Car car){   
        try{
            CarDAO.updateCar(car);
        } catch (SQLException | ClassNotFoundException e){
            System.out.println("Error when attempting to update a contact and repopulate table " + e);
        }    
    }
    
    // Clear TextFields
    private void clearCarFormTextFields(){
        carView.getCarForm().getVin().clear();
        carView.getCarForm().getMake().clear();
        carView.getCarForm().getModel().clear();
        carView.getCarForm().getColor().clear();
        carView.getCarForm().getYear().clear();
        carView.getCarForm().getMileage().clear();
        carView.getCarForm().getMpg().clear();
        carView.getCarForm().getSalesPrice().clear(); 
    }
    
    //PURCHASE ORDER TABLE RELATED
    
     //private void populatePurchaseOrderTable(){
        //try{
            //Use PurchaseOrder DAO to get list of purchase orders from db
            //purchaseOrderView.getPurchaseOrderTable().getTable().setItems(PurchaseOrderDAO.getAllPurchaseOrders());
        //} catch(SQLException | ClassNotFoundException e) {
            //System.out.println("Error populating table with car data for db.\n" + e);
        //}
    
    //}
    
    
    //SALES ORDER TABLE RELATED
    
    //private void populateSalesOrderTable(){
        //try{
            //Use SalesOrder DAO to get list of sales orders from db
            //salesOrderView.getSalesOrderTable().getTable().setItems(SalesOrderDAO.getAllSalesOrders());
        //} catch(SQLException | ClassNotFoundException e) {
            //System.out.println("Error populating table with car data for db.\n" + e);
        //}
    
    //}
    
    
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
