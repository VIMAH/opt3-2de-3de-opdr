package casus.opt3testcasus;
public abstract class PersonenAutoFactory {

    public abstract PersonenAuto maakAuto();

    public static final AudiFactory AUDI_RS = new AudiFactory();

    public static final MercedesFactory MERCEDES_AMG = new MercedesFactory();
    public static final BmwFactory BMW_M = new BmwFactory();
}