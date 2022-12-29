public class Javista extends Clovek {
    public String ide = "Netbeans";

    public Javista(String jmeno, int vek, String ide) {
        super(jmeno, vek);
        this.ide = ide;
    }

    public String getIde() {
        return ide;
    }
    public void vypisJavistu(){
        System.out.println(jmeno + " (" + vek + ")");
    }
    public void programuj(int novyPocetRadku){




           unava = novyPocetRadku/10;


        if (unava >= 20) {
            System.out.println("Jsem příliš unavený, abych programoval");
        }
        else return;
        }
}





  /*  public void vypisJavistu(){
        System.out.println(jmeno + " (" + vek + ")");
    }
    public void programuj(int novyPocetRadku){
        if (novyPocetRadku < 10)
            novyPocetRadku = 10;

        if ((novyPocetRadku/10 + getUnava()) <=20) {
            unava += (novyPocetRadku/10);
        }
        else unava =20;
        System.out.println("Jsem příliš unavený, abych programoval");
    }
}
   */









