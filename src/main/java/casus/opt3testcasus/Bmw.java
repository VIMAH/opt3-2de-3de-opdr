package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Bmw extends PersonenAuto implements Initializable {

    public Bmw() {
        super("BMW M5", 1930.00);
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
        huurButton.setDisable(getBmw().Verhuurd);
        retourKnop.setDisable(!getBmw().Verhuurd);
        klantField.setDisable(getBmw().Verhuurd);
        dagenInput.setDisable(getBmw().Verhuurd);
        if (getBmw().Verhuurd) {
            showNaam.setText("Klant voor- en achternaam: " + getBmw().klant);
            verhuurdText.setText("Dit product is niet op voorraad");
        } else {
            showNaam.setText("Dit product is beschikbaar");
            verhuurdText.setText("Dit product is beschikbaar");
        }
    }

    public Producten getBmw() {
        return OverzichtController.alleProductenLijst.get(2);
    }

    public void retourKnop() {
        getBmw().Verhuurd = false;
        huurStatus();
    }

    public void huurKnop() {
        getBmw().Verhuurd = true;
        getBmw().klant = klantField.getText();
        klantField.clear();
        dagenInput.clear();
        huurStatus();
    }
}
