import model.*;
import model.Profession.*;

public class Main {

    public static void main(String[] args) {


        Info infoss = new SpellSinger();
        Info infoshk = new ShilienKnight();
        Info infodestr = new Destroer();
        Info infoshe = new ShilienElder();
        Info infowarc = new Warcraer();
        System.out.println(infowarc.sayName());
        System.out.println(infoshe.sayAll());
        System.out.println(infoss.sayAll());
        System.out.println(infoshk.sayAll());
        System.out.println(infodestr.sayAll());




    }

}
