package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.ArrayList;

public class OverzichtController {

    public static ArrayList<Producten> alleProductenLijst = new ArrayList<>() {{
        add(PersonenAutoFactory.AUDI_RS.maakAuto());
        add(PersonenAutoFactory.MERCEDES_AMG.maakAuto());
        add(PersonenAutoFactory.BMW_M.maakAuto());
        add(new Nike());
        add(new LouisVuitton());
        add(new Dior());
        add(new MercedesVracht());
        add(new Volvo());
        add(new Renault());
    }};

    @FXML
    public void AudiHuur(Event event) throws IOException {
        SceneChanger.changeScene(event, "AudiDetailVenster.fxml");
    }

    @FXML
    public void MercedesHuur(Event event) throws IOException {
        SceneChanger.changeScene(event, "MercedesDetailVenster.fxml");
    }
    @FXML
    public void BmwHuur(Event event) throws IOException {
        SceneChanger.changeScene(event, "BmwDetailVenster.fxml");
    }
    @FXML
    public void NikeHuur(Event event) throws IOException {
        SceneChanger.changeScene(event, "NikeDetailVenster.fxml");
    }
    @FXML
    public void LouisVuittonHuur(Event event) throws IOException {
        SceneChanger.changeScene(event, "LvDetailVenster.fxml");
    }
    @FXML
    public void DiorHuur(Event event) throws IOException {
        SceneChanger.changeScene(event, "DiorDetailVenster.fxml");
    }
    @FXML
    public void MercedesVrachtHuur(Event event) throws IOException {
        SceneChanger.changeScene(event, "MercedesVrachtDetailVenster.fxml");
    }
    @FXML
    public void VolvoHuur(Event event) throws IOException {
        SceneChanger.changeScene(event, "VolvoVrachtDetailVenster.fxml");
    }
    @FXML
    public void RenaultHuur(Event event) throws IOException {
        SceneChanger.changeScene(event, "RenaultVrachtDetailVenster.fxml");
    }
    @FXML
    public void Back(Event event) {
        try {
            SceneChanger.changeScene(event, "menuView.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}