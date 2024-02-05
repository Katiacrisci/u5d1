package Caterina.Crisci.u5d1.configuration;

import Caterina.Crisci.u5d1.models.Pizza;
import Caterina.Crisci.u5d1.models.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public Pizza hawaiianPizza() {
        return new Pizza("Hawaiian", List.of(new Topping("prosciutto", 0.20f), new Topping("ananas", 0.10f)), 10);
    }

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", List.of(new Topping("mozzarella", 0.50f), new Topping("pomodoro", 0.10f)), 5);
    }
    @Bean
    public Pizza viennese() {
        return Pizza.builder()
                .name("viennese")
                .toppings(List.of(new Topping("Patatine", 0.30f), new Topping("wurstel", 0.50f)))
                .price(7)
                .build();
    }

}
