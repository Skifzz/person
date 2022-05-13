package model;

public class Range extends Damager{
    public String range = "Ренжевик - ";

    @Override
    public String sayAll() {
        return super.sayAll()+range;
    }
}
