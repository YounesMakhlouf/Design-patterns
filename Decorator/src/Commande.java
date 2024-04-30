import Article.Article;

import java.io.PrintWriter;
import java.util.List;

public class Commande {
    private final List<Article> articles;

    Commande(List<Article> articles) {
        this.articles = articles;
    }

    public void publieFacture(PrintWriter writer) {
        double total = 0;
        for (Article article : this.articles) {
            writer.println(article.Description() + " + " + article.cout());
            total = total + article.cout();
        }
        writer.println(" TOTAL : " + total);
        writer.flush();
    }
}
