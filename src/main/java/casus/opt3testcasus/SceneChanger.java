package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;
public class SceneChanger {
    public static void changeScene(Event event, String fxml) throws IOException {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Parent loader = FXMLLoader.load(Objects.requireNonNull(SceneChanger.class.getResource(fxml)));
        Scene scene = new Scene(loader);
        window.setScene(scene);
        window.show();
    }
    public static void changeScene(Event event, Scene scene) {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}