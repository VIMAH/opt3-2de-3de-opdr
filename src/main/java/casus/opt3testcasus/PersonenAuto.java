package casus.opt3testcasus;

public class PersonenAuto extends Producten {

    public PersonenAuto() {
    }

    public PersonenAuto(String merk, double gewichtKg) {
        this.merk = merk;
        this.gewichtKg = gewichtKg;
    }

    private String merk;

    private double gewichtKg;

    @Override
    public double HuurPrijsPerDag() {
        return 50.00 * getAantalDagen();
    }

    @Override
    public double Verzekering() {
        return (0.01 * gewichtKg) * getAantalDagen();
    }

}