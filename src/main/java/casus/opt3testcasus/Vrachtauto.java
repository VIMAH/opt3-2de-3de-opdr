package casus.opt3testcasus;
public class Vrachtauto extends Producten {

    private double laadvermogenKg;
    private double gewichtKg;

    public int getAantalDagen() {
        return aantalDagen;
    }

    protected int aantalDagen;

    public Vrachtauto() {

    }

    public Vrachtauto(double laadvermogenKg, double gewichtKg) {
        this.laadvermogenKg = laadvermogenKg;
        this.gewichtKg = gewichtKg;
    }

    @Override
    public double HuurPrijsPerDag() {
        return (0.10 * laadvermogenKg) * aantalDagen;
    }

    @Override
    public double Verzekering() {
        return (0.01 * gewichtKg) * aantalDagen;
    }
}