package scada;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author mrunal
 */

public class TableDocumentController implements Initializable {

    @FXML
    private javafx.scene.control.TableView<Feeders> ftag1;
    @FXML
    private javafx.scene.control.TableView<Feeders> ftag2;
    @FXML
    private javafx.scene.control.TableView<Feeders> ftag3;
    @FXML
    private javafx.scene.control.TableView<Feeders> ftag4;
    
    
     @FXML
    private TableColumn<Feeders, String> tag1;
     
     @FXML
    private TableColumn<Feeders, String> discription1;
     
     @FXML
    private TableColumn<Feeders, String> tag2;
     
     @FXML
    private TableColumn<Feeders, String> discription2;
     
     @FXML
    private TableColumn<Feeders, String> tag3;
     
     @FXML
    private TableColumn<Feeders, String> discription3;
     
     @FXML
    private TableColumn<Feeders, String> tag4;
     
     @FXML
    private TableColumn<Feeders, String> discription4;
      
      ObservableList<Feeders> data1=FXCollections.observableArrayList(
              new Feeders("AI","electrical Computer-4"),
              new Feeders("BI","Director Office,Gulabchand Reasearch-3"),
              new Feeders("CI","Applied Old Computer - 2"),
              new Feeders("DI","Hydrawlic Lab - 18")     
        );
       ObservableList<Feeders> data2=FXCollections.observableArrayList(
              new Feeders("EI","CCF - 17"),
              new Feeders("FI","Electrical Dept - 5"),
              new Feeders("GI","Electronics - 1"),
              new Feeders("HI","PG Lab,Bank Of India.")
       );
       
       ObservableList<Feeders> data3=FXCollections.observableArrayList(
              new Feeders("AII","Stage Applied, Mech, Civil Staff- 11"),
              new Feeders("BII","Stage Applied, IT - 16"),
              new Feeders("CII","Generator Room"),
              new Feeders("DII","Workshop 12")
       );
       
       ObservableList<Feeders> data4=FXCollections.observableArrayList(
              new Feeders("EII","Cyber Host.,New Liabrary,Director bunglow-10"),
              new Feeders("FII","H.E. Lab - 9"),
              new Feeders("GII","Applied Computer"),
              new Feeders("HII","CSE,Cyber hostel,elc comp,water pump")
       );
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//tag.setCellValueFactory(new PropertyValueFactory<Feeders, String>("tag"));
        tag1.setCellValueFactory(new PropertyValueFactory<>("tag"));
        discription1.setCellValueFactory(new PropertyValueFactory<>("discription"));
        
        tag2.setCellValueFactory(new PropertyValueFactory<>("tag"));
        discription2.setCellValueFactory(new PropertyValueFactory<>("discription"));
        
        tag3.setCellValueFactory(new PropertyValueFactory<>("tag"));
        discription3.setCellValueFactory(new PropertyValueFactory<>("discription"));
        
        tag4.setCellValueFactory(new PropertyValueFactory<>("tag"));
        discription4.setCellValueFactory(new PropertyValueFactory<>("discription"));
        
        ftag1.setItems(data1);
        ftag2.setItems(data2);
        ftag3.setItems(data3);
        ftag4.setItems(data4);
    }    
    
}

