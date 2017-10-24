/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scada;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 *
 * @author mrunal
 */
public class DetailsController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @FXML
    private TableView<addReadings> rtable;
    
    @FXML
    private TableView<addReadings> ytable;
    
    @FXML
    private TableView<addReadings> btable;
    
    @FXML
    private TableColumn<addReadings,Integer> r;
     
     @FXML
    private TableColumn<addReadings,Integer> y;
     
     @FXML
    private TableColumn<addReadings,Integer> b;
   
     ObservableList<addReadings> dt1=FXCollections.observableArrayList(
            // new addReadings(0,0,0),
              new addReadings(1,2,3),
              new addReadings(2,3,4),
              new addReadings(3,4,5)
               
        );
     
     ObservableList<addReadings> dt2=FXCollections.observableArrayList(
              new addReadings(1,2,3),
              new addReadings(2,3,4),
              new addReadings(3,4,5)     
        );
     
     ObservableList<addReadings> dt3=FXCollections.observableArrayList(
              new addReadings(1,2,3),
              new addReadings(2,3,4),
              new addReadings(3,4,5)     
        );

      /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
     @Override
    public void initialize(URL url, ResourceBundle rb) {
         r.setCellValueFactory(new PropertyValueFactory<>("red"));
         y.setCellValueFactory(new PropertyValueFactory<>("yellow"));
         b.setCellValueFactory(new PropertyValueFactory<>("blue"));
         
         rtable.setItems(dt1);
         ytable.setItems(dt2);
         btable.setItems(dt3);

    }
    
}
