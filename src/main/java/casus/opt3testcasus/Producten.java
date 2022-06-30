package casus.opt3testcasus;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public abstract class Producten {

    @FXML
    protected Text verhuurdText, showNaam, huurPrijs, verzekeringPrijs, totaalPrijs;

    @FXML
    protected TextField klantField, dagenInput;

    @FXML
    protected Button retourKnop, huurButton;

    @FXML
    protected CheckBox verzekeringCheck;

    protected static int aantalDagen;

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void berekenPrijs() {
        aantalDagen = Integer.parseInt(dagenInput.getText());
        huurPrijs.setText("Huur prijs: " + HuurPrijsPerDag());
        verzekeringPrijs.setText("Verzekering: " + Verzekering());
        totaalPrijs.setText("Totaal prijs: " + AllesIn(verzekeringCheck.isSelected()));
    }

    protected double AllesIn(boolean checkVerzekering) {
        double Prijs = HuurPrijsPerDag();
        if (checkVerzekering) {
            Prijs += Verzekering();
        }
        return Prijs;
    }

    public boolean Verhuurd = false;
    public String klant;

    public abstract double HuurPrijsPerDag();

    public abstract double Verzekering();
}