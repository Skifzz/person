package model;

public class Buffer extends Personaj {
    public String buff = "Бафер" + "\n";

    @Override
    public String sayAll() {
        return super.sayAll()+buff;
    }



}
