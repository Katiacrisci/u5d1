package Caterina.Crisci.u5d1.configuration;

import Caterina.Crisci.u5d1.decorators.AnanasDecorator;
import Caterina.Crisci.u5d1.decorators.FriesDecorator;
import Caterina.Crisci.u5d1.decorators.ProsciuttoDecorator;
import Caterina.Crisci.u5d1.decorators.WurstelDecorator;
import Caterina.Crisci.u5d1.models.Menu;
import Caterina.Crisci.u5d1.models.Pizza;
import Caterina.Crisci.u5d1.models.Tavolo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean (name = "hawaiian")
    public Pizza hawaiianPizza() {
        Pizza base = margherita();
        base.setToppings(List.of(new ProsciuttoDecorator(), new AnanasDecorator()));
        return base;
    }

    @Bean (name = "Margherita")
    public Pizza margherita() {
        return new Pizza();

    }
    @Bean (name = "viennese")
    public Pizza viennese() {
        Pizza base = margherita();
        base.setToppings(List.of(new FriesDecorator(), new WurstelDecorator()));
        return base;
    }


    @Bean (name = "menu")
    public Menu menu() {
        return new Menu(List.of(hawaiianPizza(), viennese(), margherita()), Collections.emptyList(), 1000);
    }
    @Bean (name = "tavolo10")
    public Tavolo tavolo() {
        return new Tavolo(10, 5, true, null);
    }

    @Value("${coperto}")
    public static int costoCoperto;

}
