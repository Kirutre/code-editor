package io.github.kirutre.code_editor.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class TextField implements Initializable {
    @FXML
    private TextArea codeTextArea;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        codeTextArea.setText("Hi World");
    }
}
