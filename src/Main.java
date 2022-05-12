import model.*;

public class Main {

    public static void main(String[] args) {

        //Personaj personaj = new ShilienKnight();
        //System.out.println((personaj).sad1());
        ShilienKnight shilienKnight = new ShilienKnight();
        shilienKnight.say();

        SpellSinger spellSinger = new SpellSinger();
        spellSinger.say();

        Destroer destroer = new Destroer();
        destroer.say();
    }
}
