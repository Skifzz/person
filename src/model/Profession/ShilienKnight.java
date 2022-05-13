package model.Profession;

import model.Tank;

public class ShilienKnight extends Tank {
    public String sk = "ШиленКнайт";

    @Override
    public String sayAll() {
        return super.sayAll()+sk;
    }
}
