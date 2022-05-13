package model;


public class Personaj implements Info {


    public String pers = "Персонаж - ";

    @Override
    public String sayAll() {
        return pers;
    }

    @Override
    public String sayName() {
        return null;
    }
}
