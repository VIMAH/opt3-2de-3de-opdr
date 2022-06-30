package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Audi extends PersonenAuto implements Initializable {
    public Audi() {
        super("Audi RS3 Sportback ", 1500.00);
    }
    @FXML
    public void Back(Event event) {
        try {
            SceneChanger.changeScene(event, "overzichtVenster.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        huurStatus();
    }

    public void huurStatus() {
        huurButton.setDisable(getAudi().Verhuurd);
        retourKnop.setDisable(!getAudi().Verhuurd);
        klantField.setDisable(getAudi().Verhuurd);
        dagenInput.setDisable(getAudi().Verhuurd);
        if (getAudi().Verhuurd) {
            showNaam.setText("Klant voor- en achternaam: " + getAudi().klant);
            verhuurdText.setText("Dit product is niet op voorraad");
        } else {
            showNaam.setText("Dit product is beschikbaar");
            verhuurdText.setText("Dit product is beschikbaar");
        }
    }

    public Producten getAudi() {
        return OverzichtController.alleProductenLijst.get(0);
    }

    public void retourKnop() {
        getAudi().Verhuurd = false;
        huurStatus();
    }

    public void huurKnop() {
        getAudi().Verhuurd = true;
        getAudi().klant = klantField.getText();
        klantField.clear();
        dagenInput.clear();
        huurStatus();
    }
}