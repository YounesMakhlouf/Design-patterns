package Topping;

import Article.Article;

public class Chantilly extends Topping {
    public Chantilly(Article wrapper) {
        super(wrapper);
    }

    @Override
    public String Description() {
        return super.Description() + " chantilly";
    }

    @Override
    public double cout() {
        return super.cout() + 0.5;
    }
}