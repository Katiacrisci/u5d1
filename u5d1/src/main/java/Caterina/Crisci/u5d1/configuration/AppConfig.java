package Caterina.Crisci.u5d1.configuration;

import Caterina.Crisci.u5d1.decorators.AnanasDecorator;
import Caterina.Crisci.u5d1.decorators.FriesDecorator;
import Caterina.Crisci.u5d1.decorators.ProsciuttoDecorator;
import Caterina.Crisci.u5d1.decorators.WurstelDecorator;
import Caterina.Crisci.u5d1.models.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Pizza hawaiianPizza() {
        Pizza base = margherita();
        base.setToppings(List.of(new ProsciuttoDecorator(), new AnanasDecorator()));
        return base;
    }

    @Bean
    public Pizza margherita() {
        return new Pizza();

    }
    @Bean
    public Pizza viennese() {
        Pizza base = margherita();
        base.setToppings(List.of(new FriesDecorator(), new WurstelDecorator()));
        return base;


    }

}
