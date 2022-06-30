package casus.opt3testcasus;
public class MercedesFactory extends PersonenAutoFactory{
    @Override
    public PersonenAuto maakAuto() {
        return new Mercedes();
    }
}
