package model.Profession;

import model.Buffer;

public class Warcraer extends Buffer {
    public String warc = "Варкраер";

    @Override
    public String sayAll() {
        return super.sayAll()+warc;
    }
}
