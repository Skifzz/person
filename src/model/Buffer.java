package model;

public class Buffer extends Personaj {
    public String buff = "x3";
    public void tell () {
        System.out.println(super.pers);
        System.out.println(buff);
    }
    public Buffer (String pers, String buff) {
        super(pers);
        this.buff = buff;
    }
}
