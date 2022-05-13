import model.*;

public class Main {

    public static void main(String[] args) {


        Personaj shilienKnight = new ShilienKnight();
        shilienKnight.say();

        Personaj spellSinger = new SpellSinger();
        spellSinger.say();

        Personaj destroer = new Destroer();
        destroer.say();



        Info info1 = new ShilienKnight();
        System.out.println(info1.sayAll());


    }

}
