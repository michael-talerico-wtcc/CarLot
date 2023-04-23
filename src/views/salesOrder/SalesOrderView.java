/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views.salesOrder;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author AlexC
 */
public class SalesOrderView extends VBox {
    //References for each pane
    private final SalesOrderForm salesOrderForm;
    private final SalesOrderTable salesOrderTable;

    //References for "Cancel" and "Process Sale" buttons
    private final Button processSaleBtn;
    private final Button cancelBtn;

    //Reference for error message Text
    private Text errorMessage;

    //Constructor
    public SalesOrderView(){

        //Create Title
        Text title = new Text("Sales Orders");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 30));

        //Create new SalesOrderTable for Reference
        salesOrderTable = new SalesOrderTable();

        //Create new SalesOrderForm for Reference
        salesOrderForm = new SalesOrderForm();

        //Create HBox for error message text
        HBox errorMessagePane = new HBox();

        //Set styles for error message HBOX (alignment - center)
        errorMessagePane.setAlignment(Pos.CENTER);

        //Create Text object for error message
        errorMessage = new Text();

        //Set Text styles
        errorMessage.setFont(Font.font("Arial, FontWeight.BOLD, 13"));
        errorMessage.setFill(Color.RED);
        errorMessage.setStroke(Color.RED);
        errorMessagePane.getChildren().add(errorMessage);

        //Create HBox for "Cancel" and "Process Sale" buttons
        HBox buttonPane = new HBox();

        //Add the buttons to HBox
        buttonPane.getChildren().addAll(cancelBtn = new Button("Cancel"), processSaleBtn = new Button("Process Sale"));

        //Button styling
        cancelBtn.setPrefWidth(150.0);
        processSaleBtn.setPrefWidth(150.0);

        //Button pane (HBox) styling
        buttonPane.setAlignment(Pos.CENTER);
        buttonPane.setSpacing(20);

        // View (VBox) styling
        setAlignment(Pos.CENTER);
        setPadding(new Insets(20));
        setSpacing(20);

        //Add to this view title, salesOrderTable, errorMessagePane, salesOrderForm, buttonPane
        getChildren().addAll(title, salesOrderTable, salesOrderForm, buttonPane);

    }


    //Getters for the form, table, buttons, text
    public SalesOrderForm getSalesOrderForm() {
        return salesOrderForm;
    }

    public SalesOrderTable getSalesOrderTable() {
        return salesOrderTable;
    }

    public Button getProcessSaleBtn() {
        return processSaleBtn;
    }

    public Button getCancelBtn() {
        return cancelBtn;
    }

    public Text getErrorMessage() {
        return errorMessage;
    }

}
