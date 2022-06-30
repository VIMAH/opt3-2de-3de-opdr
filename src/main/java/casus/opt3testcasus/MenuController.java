package casus.opt3testcasus;
import javafx.event.Event;
import java.io.IOException;
public class MenuController {
    public void toOverzicht(Event event) throws IOException {
        Menu.toOverzicht(event);
    }
    public void onLogout(Event event) throws IOException {
        Menu.onLogout(event);
    }
    public void toBeheer(Event event) throws IOException {
        Menu.toBeheer(event);
    }
    public void back(Event event) throws IOException {
        Menu.back(event);
    }
}