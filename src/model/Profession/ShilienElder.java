package model.Profession;

import model.Healer;

public class ShilienElder extends Healer {
    public String she = "Шилен Элдер" + "\n";

    @Override
    public String sayAll() {
        return super.sayAll()+she;
    }

    @Override
    public String sayAll1() {
        return sayAll();
    }

    public void setShe(){}
    public String getShe(){ return sayAll1(); }
}
