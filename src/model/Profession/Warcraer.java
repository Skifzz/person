package model.Profession;

import model.Buffer;

public class Warcraer extends Buffer {
    public String warc = "Варкраер";
    public String name = "Tadelius";
    @Override
    public String sayAll() { return super.sayAll()+warc; }
    @Override
    public String sayName(){return sayAll()+" "+name;}

}
