package Glace;

public class TripleChocolat extends CoupeGlacee {
    public static final TripleChocolat SINGLETON = new TripleChocolat();

    private TripleChocolat() {
        this.parfums.add(Parfum.CHOCOBLANC);
        this.parfums.add(Parfum.CHOCOLAIT);
        this.parfums.add(Parfum.CHOCONOIR);
    }

    public double cout() {
        return 6;
    }
}