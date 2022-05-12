package model;

public class Mili extends Damager{
    public String mili = "Милишник - ";

    public void say(){
        System.out.print(super.pers);
        System.out.print(super.dd);
        System.out.println(mili);
    }
}
