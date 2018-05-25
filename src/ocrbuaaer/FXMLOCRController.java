/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocrbuaaer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author wuxingzhe
 */
public class FXMLOCRController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private TextArea TextArea1;
    @FXML
    private TextArea TextArea2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void handleButtonAction1(ActionEvent event) {
        System.out.println("You clicked me!");
        TextArea1.setText("111");
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        System.out.println("You clicked me!");
        TextArea1.setText("222");
    }
    
    @FXML
    private void handleButtonAction3(ActionEvent event) {
        System.out.println("222333");
        TextArea2.setText("333");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
