package model.Profession;

import model.Mili;

public class Destroer extends Mili {
    public String destr = "Дестроер";

    @Override
    public String sayAll() {
        return super.sayAll()+destr;
    }
}
