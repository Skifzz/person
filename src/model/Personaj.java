package model;


import model.Profession.Warcraer;

public class Personaj implements Info {


    public String pers = "Я персонаж - ";
    public String name;
    @Override
    public String sayAll() {
        return pers;
    }

    @Override
    public String sayName() {
        return name;
    }
}
