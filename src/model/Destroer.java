package model;

public class Destroer extends Mili{
    public String destr = "Дестроер";

    public void say(){
        System.out.print(super.pers);
        System.out.print(super.dd);
        System.out.print(super.mili);
        System.out.println(destr);
    }
}
