package model;


public class Personaj implements Info {


    public String pers = "Персонаж - ";

    @Override
    public String sayAll() {
        return pers;
    }
}
