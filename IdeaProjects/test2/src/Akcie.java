public class Akcie {
    public int pocet =0;
    public String jmeno;
    public int cena;
    public int vynosDividendy;


    public Akcie(String jmeno, int cena,int vynosDividendy){
        this.jmeno = jmeno;
        this.cena = cena;
        this.vynosDividendy =vynosDividendy;
    }
    public void nakup(int pocet){
         cena = pocet * cena;
         vynosDividendy = pocet*vynosDividendy;

         System.out.println(pocet +" akcii od spolecnosti " + jmeno +" ma vynos " + vynosDividendy + "za rok a celkova cena nakupu je " + cena +" kc" );
    }



}
