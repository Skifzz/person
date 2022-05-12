package model;

public class Damager extends Personaj {
    public String dd = "ДД - ";

    public void say(){
        System.out.print(super.pers);
        System.out.println(dd);
    }
}
