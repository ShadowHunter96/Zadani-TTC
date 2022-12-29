import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Databaze {
    Generator generator = new Generator();
    public ArrayList<Generator>databaze;
    public Databaze() {
        databaze = new ArrayList<Generator>();
        System.out.println("Creating new databaze");
    }
        public void add( String Generator){
        System.out.println("adding new generator into waitlist ");
           databaze.add(generator);
    }
    public void ukazAktivni(){
        if (databaze.isEmpty()){
            System.out.println("no data in databaze");
        return;
        }
       for (int i =0;i < databaze.size();i++){
           System.out.println(generator+" ");



        }

    }





}
