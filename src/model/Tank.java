package model;


public class Tank extends Personaj{

    public String tank = "Танк" + "\n";


    @Override
    public String sayAll() {
        return super.sayAll()+tank;
    }
}

