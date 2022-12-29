public class Clovek {
    public String jmeno;
    /**
     * Věk
     */
    public int vek;
    /**
     * Únava
     */
    public double unava = 0;

    public void setUnava(double unava) {
        this.unava = unava;
    }

    public double getUnava() {
        return unava;
    }

    /**
     * Inicializuje novou instanci
     * @param jmeno Celé jméno
     * @param vek Věk
     */
    public Clovek(String jmeno, int vek)
    {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    /**
     * Spí danou dobu
     * @param doba Doba v hodinách
     */
    public void spi(int doba)
    {
        unava -= doba * 10;
        if (unava < 0)
            unava = 0;
    }

    /**
     * Uběhne danou vzdálenost
     * @param vzdalenost Vzdálenost v Km
     */
    public void behej(int vzdalenost)
    {
        if (unava + vzdalenost <= 20)
            unava += vzdalenost;
        else
            System.out.println("Jsem příliš unavený");
    }

    /**
     * Vrátí textovou reprezentaci člověka
     * @return textová reprezentace člověka
     */
    @Override
    public String toString()
    {
        return String.format("%s (%d)", jmeno, vek);
    }









}
