package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class LouisVuitton extends Boormachine implements Initializable {

    public LouisVuitton() {
        super("Louis Vuitton", "Blokkenboor");
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
        huurButton.setDisable(getLv().Verhuurd);
        retourKnop.setDisable(!getLv().Verhuurd);
        klantField.setDisable(getLv().Verhuurd);
        dagenInput.setDisable(getLv().Verhuurd);
        if (getLv().Verhuurd) {
            showNaam.setText("Klant voor- en achternaam: " + getLv().klant);
            verhuurdText.setText("Dit product is niet op voorraad");
        } else {
            showNaam.setText("Dit product is beschikbaar");
            verhuurdText.setText("Dit product is beschikbaar");
        }
    }

    public Producten getLv() {
        return OverzichtController.alleProductenLijst.get(4);
    }


    public void retourKnop() {
        getLv().Verhuurd = false;
        huurStatus();
    }

    public void huurKnop() {
        getLv().Verhuurd = true;
        getLv().klant = klantField.getText();
        klantField.clear();
        dagenInput.clear();
        huurStatus();
    }
}