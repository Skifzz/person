package model;

public class SpellSinger extends Range{
    public String ss = "СпелСингер";

    public void say(){
        System.out.print(super.pers);
        System.out.print(super.dd);
        System.out.print(super.range);
        System.out.println(ss);
    }
}
