package casus.opt3testcasus;
public class BmwFactory extends PersonenAutoFactory {
    @Override
    public PersonenAuto maakAuto() {
        return new Bmw();
    }
}
