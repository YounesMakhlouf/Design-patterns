package Glace;

public class FruitsRouges extends CoupeGlacee {
    public static final FruitsRouges SINGLETON = new FruitsRouges();

    private FruitsRouges() {
        this.parfums.add(Parfum.FRAISE);
        this.parfums.add(Parfum.FRAMBOISE);
        this.parfums.add(Parfum.CASSIS);
    }

    public double cout() {
        return 5.5;
    }
}