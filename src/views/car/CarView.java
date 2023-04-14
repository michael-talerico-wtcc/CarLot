/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.car;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author AlexC
 */
public class CarView extends VBox{
    // Reference for each Pane
    private final CarTable carTable;
    private final CarForm carForm;
    
    //Reference for each button
    private final Button updateBtn;
    
    //Constuctor with layout info
    public CarView(){
        
        //Title
        Text title = new Text("CarLot Inventory");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 30));  
    
        //New CarTable
        carTable = new CarTable();
        
        //New CarForm
        carForm = new CarForm();
        
        //New Update Button and Button Styling
        updateBtn = new Button("Update");
        updateBtn.setPrefWidth(150.0);
        
        //This Pane extends VBox so I can use "this" for styling CarView
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20.0));
        this.setSpacing(20);
        
        //Static method that adds margins just to node carTable
        VBox.setMargin(carTable, new Insets(20.0));
    
        //Add to CarView
        this.getChildren().addAll(title, carTable, carForm, updateBtn);
    
    }

    //Getters for Attributes
    public CarTable getCarTable() {
        return carTable;
    }

    public CarForm getCarForm() {
        return carForm;
    }

    public Button getUpdateBtn() {
        return updateBtn;
    }
}
