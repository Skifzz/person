package model;

public class Healer extends Personaj{
    public String heal = "Хилер - ";

    @Override
    public String sayAll() {
        return super.sayAll()+heal;
    }







}

