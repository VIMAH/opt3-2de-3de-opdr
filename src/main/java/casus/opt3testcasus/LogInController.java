package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

import java.io.IOException;

public class LogInController {

    @FXML
    private TextField idField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button logInButton;

    @FXML
    private Text warningText;

    public void LogIn (Event event) throws IOException {
        LogIn.Login(idField.getText(),passwordField.getText(),event);
    }
    public void OnPasswordKeyReleased(KeyEvent e) throws IOException
    {
        if (e.getCode() == KeyCode.ENTER)
        {
            LogIn(e);
        }
    }

}
