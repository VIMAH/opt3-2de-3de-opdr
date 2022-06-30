package casus.opt3testcasus;

public class AudiFactory extends PersonenAutoFactory {
    @Override
    public PersonenAuto maakAuto() {
        return new Audi();
    }
}
