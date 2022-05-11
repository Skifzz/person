import model.Buffer;
import model.Damager;
import model.Healer;

public class Main {

    public static void main(String[] args) {
        Buffer warc = new Buffer("Персонаж", "Варк");
        warc.say("Tadelius");
//        warc.tell();

        Healer ee = new Healer("Персонаж", "ЕЕшка");
        ee.say("Sorcus");
//        ee.tell();

        Damager hawk = new Damager("Персонаж", "Хавкай");
        hawk.say("ZeZee");
//        hawk.tell();
    }
}
