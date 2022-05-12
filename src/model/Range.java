package model;

public class Range extends Damager{
    public String range = "Ренжевик - ";

    public void say(){
        System.out.print(super.pers);
        System.out.print(super.dd);
        System.out.println(range);
    }
}
