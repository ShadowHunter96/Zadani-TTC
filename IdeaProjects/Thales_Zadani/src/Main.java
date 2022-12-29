import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Databaze databaze = new Databaze();
        Generator generator = new Generator();

        generator.generuj();
        generator.generuj();

        databaze.add(String.valueOf(generator));

        databaze.ukazAktivni();






    }
}