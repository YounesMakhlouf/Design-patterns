package Glace;

import Article.Article;

import java.util.ArrayList;
import java.util.List;

public abstract class CoupeGlacee implements Article {
    protected final List<Parfum> parfums = new ArrayList<>();

    protected CoupeGlacee() {
    }

    public String Description() {
        StringBuilder sb = new StringBuilder();
        sb.append("Coupe ");
        for (Object parfum : parfums) {
            sb.append(parfum.toString());
            sb.append(" ");
        }
        return sb.toString();
    }

    public abstract double cout();
}