package casus.opt3testcasus;

import javafx.event.Event;

import java.io.IOException;

public class LogIn {

    static Account a = new Account("Bert","123");
    public static void Login(String un, String pw, Event event) throws IOException {
        if (a.getUserName().equalsIgnoreCase(un)) {
            if (a.getPassWord().equalsIgnoreCase(pw)) {
                SceneChanger.changeScene(event, "menuView.fxml");
            }
        }
    }
}
