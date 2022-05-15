package model.Profession;

import model.Mili;

public class Destroer extends Mili {
    public String destr = "Дестроер" + "\n";

    @Override
    public String sayAll() {
        return super.sayAll()+destr;

    }

    @Override
    public String sayAll1() {
        return sayAll();
    }

    public void setDestr(){}
    public String getDestr(){ return sayAll1(); }

}
