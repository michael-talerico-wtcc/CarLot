/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.purchaseOrder;

import javafx.scene.layout.HBox;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.geometry.Pos;
import javafx.scene.control.TableColumn;

/**
 *
 * @author AlexC
 */
public class PurchaseOrderTable extends HBox{
    // TableView Reference
    
    
    //Table Column References (Integer id, LocalDate datePurchased, 
        //String vin, Integer year, String make, String model, String color, 
        // Integer mileage, Integer mpg, Double cost)
    
    
    
    public PurchaseOrderTable(){
    
        //New TableView
        
        
        //Create the new Table Columns
        
        
        //Set Column Min Width
            
        
        
        //Get column cell values from PurchaseOrder data model 
            // For properties that can be retrieved directly use:
            // id.setCellValueFactory(new PropertyValueFactory<> ("id"));
            // For the properties that have to retrieved from the Car Attribute use: 
            // ex: vin.setCellValueFactory(cellData -> new ReadOnlyObjectWrapper(cellData.getValue().getCar().getVin()));
        
        
        
        //Add columns to table
        
        
        //Gid rid of extra column created
        
        
        //Add table to this pane
        
        //Set Pane styles
        
    }
    
    // Creater getter for table
}
