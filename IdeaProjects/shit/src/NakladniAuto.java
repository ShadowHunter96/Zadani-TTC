public class NakladniAuto extends Auto{
    private int nosnost;
public NakladniAuto(String spz, String znacka, int cena, int nosnost){
    super(spz,znacka,cena);
    this.nosnost= nosnost;

}
public int getNosnost() {
    return nosnost;
}

}
