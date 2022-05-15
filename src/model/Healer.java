package model;

public class Healer extends Personaj{
    public String heal = "Хилер" + "\n";

    @Override
    public String sayAll() {
        return super.sayAll()+heal;
    }







}

