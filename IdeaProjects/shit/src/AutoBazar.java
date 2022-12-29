import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class AutoBazar {
    private String adresa;
    private int pokladna;
    private ArrayList<Auto>auta = new ArrayList<>();
    public AutoBazar(String adresa, int pokladna){
        this.adresa = adresa;
        this.pokladna = pokladna;

    }
public int getPocetAut(){
        return auta.size();

}
public int getPokladna(){
        return pokladna;
}

public void pridejAuto(Auto auto) {
    if (auto.getCena() <= pokladna) {
        auta.add(auto);
        pokladna += auto.getCena();

    }
}
        public void prodejAuto(Auto auto){
            auta.remove(auto);
            pokladna -=auto.getCena();
    }
public int spoctiCenuAut(){
            int cena=0;
            for(int i = 0; i<auta.size();i++ ){
                cena += auta.get(i).getCena();
            }

return cena;
    }
public void vypisAuto(){
        if(AutoBazar.isEmpty()){
            System.out.println("bez aut");
        return;
        }
        Iterator<auta> iterator = auta.iterator();
        while (iterator.hasNext()){
            System.out.println(AutoBazar);

        }
}

    private static boolean isEmpty() {
    }


}





