package model.Profession;

import model.Buffer;

public class Warcraer extends Buffer {
    public String warc = "Варкраер" + "\n";

    @Override
    public String sayAll() { return super.sayAll()+warc; }


    @Override
    public String sayAll1() {
        return sayAll();
    }

    public void setWarc(){}
    public String getWarc(){ return sayAll1(); }

}
