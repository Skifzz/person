package model;

public class Healer extends Personaj{
    public String heal = "x3";
    void tell () {
        System.out.println(super.pers);
        System.out.println(heal);
    }
    public Healer (String pers, String heal) {
        super(pers);
        this.heal = heal;
    }
}

