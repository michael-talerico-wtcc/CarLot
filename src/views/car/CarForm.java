/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.car;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author AlexC
 */
public class CarForm extends HBox{
    // Grid Layout Reference
    private final GridPane grid;
    
    // Textfields References
    private final TextField vin;
    private final TextField year;
    private final TextField make;  
    private final TextField model; 
    private final TextField color;
    private final TextField mileage;
    private final TextField mpg;
    private final TextField salesPrice;
            
                
    public CarForm(){
        
        //New GridPane
        grid = new GridPane();
        
        //Grid Styles
        grid.setHgap(20.0);
        grid.setVgap(15.0);
        
 
        //Add Labels and Textfields to Grid with add(Node, col index, row index)
        
        //Row 0: vin, year, make, model. 
        grid.add(new Label("VIN:"),0,0);
        grid.add(vin = new TextField(), 1, 0);
     
        grid.add(new Label("Year:"), 2, 0);
        grid.add(year = new TextField(), 3, 0);
        
        grid.add(new Label("Make:"),4 , 0);
        grid.add(make = new TextField(), 5, 0);
        
        grid.add(new Label("Model:"), 6, 0);
        grid.add(model = new TextField(), 7, 0);
        
        
        //Row 1: color, mileage, mpg, sales price
        grid.add(new Label("Color:"), 0, 1);
        grid.add(color = new TextField(), 1, 1);
        
        grid.add(new Label("Mileage:"), 2, 1);
        grid.add(mileage = new TextField(), 3, 1);
        
        grid.add(new Label("MPG HWY:"), 4, 1);
        grid.add(mpg = new TextField(), 5, 1);
        
        grid.add(new Label("Sales Price:"), 6,1);
        grid.add(salesPrice = new TextField(), 7, 1);
        
        
        //This Pane extends HBox so I can add grid directly to the CarForm Pane
        this.getChildren().add(grid);
        
        //Set CarForm Styles
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20));
        //Styling for form
        this.setStyle("-fx-border-color: gray; -fx-border-width: 5px;" );
        
        // (JUST FOR CAR TABLE)
        vin.setEditable(false); 
        vin.setStyle("-fx-background-color: rgb(233,228,228)");
        
    }

    // Getters for all TextFields
    public TextField getVin() {
        return vin;
    }

    public TextField getYear() {
        return year;
    }

    public TextField getMake() {
        return make;
    }

    public TextField getModel() {
        return model;
    }

    public TextField getColor() {
        return color;
    }

    public TextField getMileage() {
        return mileage;
    }

    public TextField getMpg() {
        return mpg;
    }

    public TextField getSalesPrice() {
        return salesPrice;
    }
}
