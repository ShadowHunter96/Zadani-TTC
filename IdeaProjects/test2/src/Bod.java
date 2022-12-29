public class Bod {
    private final int X;
    private final int Y;
    private int Hodnota;


    public Bod(int X, int Y, int Hodnota){
        this.X = X;
        this.Y = Y;
        this.Hodnota = Hodnota;
    }

    public int getX() { return this.X; } //Čtení pozice X
    public int getY() { return this.Y; } //Čtení pozice Y
    public int getHodnota() { return this.Hodnota; }  //Čtení hodnoty

    public void setHodnota(int Hodnota) { this.Hodnota = Hodnota; } //Nastavení hodnoty

}
