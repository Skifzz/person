package model;

public class Mili extends Damager{
    public String mili = "Милишник" + "\n";

    @Override
    public String sayAll() {
        return super.sayAll()+mili;
    }
}
