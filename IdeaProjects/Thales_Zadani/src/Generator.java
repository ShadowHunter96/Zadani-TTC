import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Generator {
    private int poradoveCislo=0;
    LocalDateTime dateTime = LocalDateTime.now();
    String thisTime = dateTime.format(DateTimeFormatter.ofPattern("y-Md HH:mm"));

    public Generator(){

    }
    public void generuj(){
        LocalDateTime dateTime = LocalDateTime.now();
        String thisTime = dateTime.format(DateTimeFormatter.ofPattern("y-Md HH:mm"));
        poradoveCislo++;
        System.out.println("- " + poradoveCislo + ", " + thisTime );
    }




     public String toString(){
        return new String ("- " + poradoveCislo + ", " + thisTime);
     }






}
