package model;

public class SpellSinger extends Range{
    public String ss = "СпелСингер";

    @Override
    public String sayAll() {
        return super.sayAll()+ss;
    }
}
