package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;

import java.io.IOException;

public class BeheerController {

    @FXML
    public void GoPersonenAuto(Event event) throws IOException {
        SceneChanger.changeScene(event, "PersonenAutoProductenVenster.fxml");
    }

    @FXML
    public void GoVrachtAuto(Event event) throws IOException {
        SceneChanger.changeScene(event, "VrachtAutoProductenVenster.fxml");
    }

    @FXML
    public void GoBoorMachine(Event event) throws IOException {
        SceneChanger.changeScene(event, "BoorMachineProductenVenster.fxml");
    }

    @FXML
    public void Back(Event event) {
        try {
            SceneChanger.changeScene(event, "MenuView.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
