package casus.opt3testcasus;
import javafx.event.Event;
import java.io.IOException;
public class Menu {

    public static void toOverzicht(Event event) throws IOException {
        SceneChanger.changeScene(event, "overzichtVenster.fxml");
    }

    public static void onLogout(Event event) throws IOException {
        SceneChanger.changeScene(event, "logInView.fxml");
    }

    public static void toBeheer(Event event) throws IOException {
        SceneChanger.changeScene(event, "BeheerVenster.fxml");
    }

    public static void back(Event event) throws IOException {
        SceneChanger.changeScene(event, "menuView.fxml");
    }

}
