import model.*;
import model.Profession.Destroer;
import model.Profession.ShilienElder;
import model.Profession.ShilienKnight;
import model.Profession.SpellSinger;

public class Main {

    public static void main(String[] args) {


        Info infoss = new SpellSinger();
        Info infoshk = new ShilienKnight();
        Info infodestr = new Destroer();
        Info infoshe = new ShilienElder();
        System.out.println(infoshe.sayAll());
        System.out.println(infoss.sayAll());
        System.out.println(infoshk.sayAll());
        System.out.println(infodestr.sayAll());




    }

}
