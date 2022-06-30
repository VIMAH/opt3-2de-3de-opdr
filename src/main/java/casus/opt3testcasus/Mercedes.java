package casus.opt3testcasus;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Mercedes extends PersonenAuto implements Initializable {
    public Mercedes() {
        super("Mercedes AMG GLE 63s", 2245.00);
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
        huurButton.setDisable(getMercedes().Verhuurd);
        retourKnop.setDisable(!getMercedes().Verhuurd);
        klantField.setDisable(getMercedes().Verhuurd);
        dagenInput.setDisable(getMercedes().Verhuurd);
        if (getMercedes().Verhuurd) {
            showNaam.setText("Klant voor- en achternaam: " + getMercedes().klant);
            verhuurdText.setText("Dit product is niet op voorraad");
        } else {
            showNaam.setText("Dit product is beschikbaar");
            verhuurdText.setText("Dit product is beschikbaar");
        }
    }

    public Producten getMercedes() {
        return OverzichtController.alleProductenLijst.get(1);
    }


    public void retourKnop() {
        getMercedes().Verhuurd = false;
        huurStatus();
    }

    public void huurKnop() {
        getMercedes().Verhuurd = true;
        getMercedes().klant = klantField.getText();
        klantField.clear();
        dagenInput.clear();
        huurStatus();
    }
}
