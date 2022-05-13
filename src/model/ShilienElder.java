package model;

public class ShilienElder extends Healer{
    public String she = "ШиленЕлдер";

    @Override
    public String sayAll() {
        return super.sayAll()+she;
    }
}
