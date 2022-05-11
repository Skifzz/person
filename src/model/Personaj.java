package model;

public class Personaj {
    public String pers = "x3";
    public void say (String pers) {
        System.out.println("i'm " + pers);
    }
    public Personaj () {}
    public Personaj (String p){
        pers = p;
    }

}
