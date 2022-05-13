package model;


public class Tank extends Personaj{

    public String tank = "Танк - ";


    @Override
    public String sayAll() {
        return super.sayAll()+tank;
    }
}

