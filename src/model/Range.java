package model;

public class Range extends Damager{
    public String range = "Ренжевик" + "\n";

    @Override
    public String sayAll() {
        return super.sayAll()+range;
    }
}
