package Topping;

import Article.Article;

public abstract class Topping implements Article {
    public final Article wrapper;

    public Topping(Article wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String Description() {
        return this.wrapper.Description();
    }

    public double cout() {
        return this.wrapper.cout();
    }
}