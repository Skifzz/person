package model;


import model.Profession.Warcraer;

public class Personaj implements Info {


    public String pers = "Это персонаж" + "\n";
    public String name;
    @Override
    public String sayAll() {
        return pers;
    }
    public String sayAll1() {
        return pers;
    }
    @Override
    public String sayName() {
        return name;
    }
}
