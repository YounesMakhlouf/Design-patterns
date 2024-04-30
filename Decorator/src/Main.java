import Article.Article;
import Boisson.*;
import Glace.*;
import Topping.*;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Article> articles = new ArrayList<>();

        // Create toppings
        Topping chantillyWithFruitsRouges = new Chantilly(FruitsRouges.SINGLETON);
        Topping coulisFraiseWithChantilly = new CoulisFraise(chantillyWithFruitsRouges);
        Topping chantillyWithSauceChocolat = new Chantilly(new SauceChocolat(TripleChocolat.SINGLETON));

        Boisson robusta = new Robusta();
        Boisson arabica = new Arabica();
        Boisson chocolatChaud = new ChocolatChaud();

        // Add articles to the list
        articles.add(chantillyWithFruitsRouges);
        articles.add(coulisFraiseWithChantilly);
        articles.add(TripleChocolat.SINGLETON);
        articles.add(chantillyWithSauceChocolat);
        articles.add(robusta);
        articles.add(arabica);
        articles.add(chocolatChaud);

        // Create and publish the commande
        PrintWriter consoleWriter = new PrintWriter(System.out);
        Commande commande = new Commande(articles);
        commande.publieFacture(consoleWriter);
    }
}