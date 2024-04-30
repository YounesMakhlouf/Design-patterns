package Boisson;

public class Cafe extends Boisson{

    @Override
    public String Description() {
        return "Café";
    }

    @Override
    public double cout() {
        return 1.5;
    }
}
