package Glace;

public class Parfum {
    public static final Parfum CASSIS = new Parfum("Cassis");
    public static final Parfum CHOCOBLANC = new Parfum("Chocolat Blanc");
    public static final Parfum CHOCOLAIT = new Parfum("Chocolat Lait");
    public static final Parfum CHOCONOIR = new Parfum("Chocolat Noir");
    public static final Parfum FRAISE = new Parfum("Fraise");
    public static final Parfum FRAMBOISE = new Parfum("Framboise");
    public final String name;

    public Parfum(String s) {
        name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
