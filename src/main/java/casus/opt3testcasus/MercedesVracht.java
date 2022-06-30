package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MercedesVracht extends Vrachtauto implements Initializable {

        public MercedesVracht() {
            super(7255.00, 18600.00);

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
            huurButton.setDisable(getMercedesVracht().Verhuurd);
            retourKnop.setDisable(!getMercedesVracht().Verhuurd);
            klantField.setDisable(getMercedesVracht().Verhuurd);
            dagenInput.setDisable(getMercedesVracht().Verhuurd);
            if (getMercedesVracht().Verhuurd) {
                showNaam.setText("Klant voor- en achternaam: " + getMercedesVracht().klant);
                verhuurdText.setText("Dit product is niet op voorraad");
            } else {
                showNaam.setText("Dit product is beschikbaar");
                verhuurdText.setText("Dit product is beschikbaar");
            }
        }

        public Producten getMercedesVracht() {
            return OverzichtController.alleProductenLijst.get(6);
        }


        public void retourKnop() {
            getMercedesVracht().Verhuurd = false;
            huurStatus();
        }

        public void huurKnop() {
            getMercedesVracht().Verhuurd = true;
            getMercedesVracht().klant = klantField.getText();
            klantField.clear();
            dagenInput.clear();
            huurStatus();
        }
    }