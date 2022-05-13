package model;


public class Tank extends Personaj{

    public String tank = "Танк - ";
    public void say(){
        System.out.print(super.pers);
        System.out.println(tank);
    }

    @Override
    public String sayAll() {
        return super.sayAll()+tank;
    }
}

