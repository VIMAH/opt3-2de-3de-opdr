package casus.opt3testcasus;

public class Boormachine extends Producten {

    private String merk;
    private String type;

    public int getAantalDagen() {
        return aantalDagen;
    }

    protected int aantalDagen;

    public Boormachine() {

    }

    public Boormachine(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }

    @Override
    public double HuurPrijsPerDag() {
        return 5.00 * aantalDagen;
    }

    @Override
    public double Verzekering() {
        return 1.00 * aantalDagen;
    }
}