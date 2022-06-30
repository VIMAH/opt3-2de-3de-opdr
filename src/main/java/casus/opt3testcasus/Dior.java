package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Dior extends Boormachine implements Initializable {

    public Dior() {
        super("Dior","DiorBoor");
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
            huurButton.setDisable(getDior().Verhuurd);
            retourKnop.setDisable(!getDior().Verhuurd);
            klantField.setDisable(getDior().Verhuurd);
            dagenInput.setDisable(getDior().Verhuurd);
            if (getDior().Verhuurd) {
                showNaam.setText("Klant voor- en achternaam: " + getDior().klant);
                verhuurdText.setText("Dit product is niet op voorraad");
            } else {
                showNaam.setText("Dit product is beschikbaar");
                verhuurdText.setText("Dit product is beschikbaar");
            }
        }

        public Producten getDior() {
            return OverzichtController.alleProductenLijst.get(5);
        }


        public void retourKnop() {
            getDior().Verhuurd = false;
            huurStatus();
        }

        public void huurKnop() {
            getDior().Verhuurd = true;
            getDior().klant = klantField.getText();
            klantField.clear();
            dagenInput.clear();
            huurStatus();
        }
    }