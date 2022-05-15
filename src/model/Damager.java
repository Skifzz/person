package model;

public class Damager extends Personaj {
    public String dd = "ДД" + "\n";
    @Override
    public String sayAll() {
        return super.sayAll()+dd;
    }
}
