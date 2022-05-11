package model;

public class Damager extends Personaj {
    public String dd = "x3";
    void tell () {
        System.out.println(super.pers);
        System.out.println(dd);
    }
    public Damager (String pers, String dd) {
        super(pers);
        this.dd = dd;
    }
}
