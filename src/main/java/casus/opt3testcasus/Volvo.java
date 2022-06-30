package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class Volvo extends Vrachtauto implements Initializable {
    public Volvo() {
        super(4000.00, 4500.00);

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
            huurButton.setDisable(getVolvoV().Verhuurd);
            retourKnop.setDisable(!getVolvoV().Verhuurd);
            klantField.setDisable(getVolvoV().Verhuurd);
            dagenInput.setDisable(getVolvoV().Verhuurd);
            if (getVolvoV().Verhuurd) {
                showNaam.setText("Klant voor- en achternaam: " + getVolvoV().klant);
                verhuurdText.setText("Dit product is niet op voorraad");
            } else {
                showNaam.setText("Dit product is beschikbaar");
                verhuurdText.setText("Dit product is beschikbaar");
            }
        }

        public Producten getVolvoV() {
            return OverzichtController.alleProductenLijst.get(1);
        }


        public void retourKnop() {
            getVolvoV().Verhuurd = false;
            huurStatus();
        }

        public void huurKnop() {
            getVolvoV().Verhuurd = true;
            getVolvoV().klant = klantField.getText();
            klantField.clear();
            dagenInput.clear();
            huurStatus();
        }
    }