package model.Profession;

import model.Range;

public class SpellSinger extends Range {
    public String ss = "Спелл Сингер" + "\n";

    @Override
    public String sayAll() {
        return super.sayAll()+ss;
    }


    @Override
    public String sayAll1() {
        return sayAll();
    }

    public void setSs(){}
    public String getSs(){ return sayAll1(); }
}
