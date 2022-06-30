package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

    public class Renault extends Vrachtauto implements Initializable {

        public Renault() {
            super(1000.00, 20000.00);

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
            huurButton.setDisable(getRenault().Verhuurd);
            retourKnop.setDisable(!getRenault().Verhuurd);
            klantField.setDisable(getRenault().Verhuurd);
            dagenInput.setDisable(getRenault().Verhuurd);
            if (getRenault().Verhuurd) {
                showNaam.setText("Klant voor- en achternaam: " + getRenault().klant);
                verhuurdText.setText("Dit product is niet op voorraad");
            } else {
                showNaam.setText("Dit product is beschikbaar");
                verhuurdText.setText("Dit product is beschikbaar");
            }
        }

        public Producten getRenault() {
            return OverzichtController.alleProductenLijst.get(8);
        }


        public void retourKnop() {
            getRenault().Verhuurd = false;
            huurStatus();
        }

        public void huurKnop() {
            getRenault().Verhuurd = true;
            getRenault().klant = klantField.getText();
            klantField.clear();
            dagenInput.clear();
            huurStatus();
        }
    }