public class Auto {
    private String znacka;
    private String spz;
    private int cena;


    public Auto(String znacka, String spz, int cena){
        this.znacka= znacka;
        this.spz=spz;
        this.cena=cena;

    }




    public String getZnacka() {
        return znacka;
    }

    public String getSpz() {
        return spz;
    }

    public int getCena() {
        return cena;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
