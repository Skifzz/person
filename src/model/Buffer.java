package model;

public class Buffer extends Personaj {
    public String buff = "Бафер - ";

    public void say(){
        System.out.print(super.pers);
        System.out.println(buff);
    }

}
