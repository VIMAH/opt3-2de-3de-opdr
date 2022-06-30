package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;
import java.io.IOException;
public class ProductenController {
    @FXML
    public void Back(Event event) {
        try {
            SceneChanger.changeScene(event, "BeheerVenster.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}