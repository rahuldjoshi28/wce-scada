/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scada;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author mrunal
 */

public class TableView extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Parent parent=FXMLLoader.load(getClass().getResource("/tableview/FXMLDocument.fxml"));
        Scene scene=new Scene(parent);
       
        
        stage.setTitle("TableView");
        stage.setScene(scene);
        stage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

