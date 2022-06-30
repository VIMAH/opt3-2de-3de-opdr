package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Nike extends Boormachine implements Initializable {
        public Nike() {
            super("Nike boor", "Deurboor");
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
            huurButton.setDisable(getNike().Verhuurd);
            retourKnop.setDisable(!getNike().Verhuurd);
            klantField.setDisable(getNike().Verhuurd);
            dagenInput.setDisable(getNike().Verhuurd);
            if (getNike().Verhuurd) {
                showNaam.setText("Klant voor- en achternaam: " + getNike().klant);
                verhuurdText.setText("Dit product is niet op voorraad");
            } else {
                showNaam.setText("Dit product is beschikbaar");
                verhuurdText.setText("Dit product is beschikbaar");
            }
        }

        public Producten getNike() {
            return OverzichtController.alleProductenLijst.get(3);
        }

        public void retourKnop() {
            getNike().Verhuurd = false;
            huurStatus();
        }

        public void huurKnop() {
            getNike().Verhuurd = true;
            getNike().klant = klantField.getText();
            klantField.clear();
            dagenInput.clear();
            huurStatus();
        }
    }