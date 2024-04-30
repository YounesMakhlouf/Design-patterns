package Topping;

import Article.Article;

public class SauceChocolat extends Topping {
    public SauceChocolat(Article wrapper) {
        super(wrapper);
    }

    @Override
    public String Description() {
        return super.Description() + " et sa délicieuse sauce chocolat";
    }

    @Override
    public double cout() {
        return super.cout() + 0.7;
    }
}