package model.Profession;

import model.Tank;

public class ShilienKnight extends Tank {
    public String sk = "Шилен Кнайт" + "\n";

    @Override
    public String sayAll() {
        return super.sayAll()+sk;
    }

    @Override
    public String sayAll1() {
        return sayAll();
    }

    public void setSk(){}
    public String getSk(){ return sayAll1(); }
}
