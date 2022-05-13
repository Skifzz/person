package model;

public class Mili extends Damager{
    public String mili = "Милишник - ";

    @Override
    public String sayAll() {
        return super.sayAll()+mili;
    }
}
