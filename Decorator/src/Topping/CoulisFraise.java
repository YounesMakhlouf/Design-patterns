package Topping;

import Article.Article;

public class CoulisFraise extends Topping {
    public CoulisFraise(Article wrapper) {
        super(wrapper);
    }

    @Override
    public String Description() {
        return super.Description() + " au coulis de fraises fraiches";
    }

    @Override
    public double cout() {
        return super.cout() + 1;
    }
}
