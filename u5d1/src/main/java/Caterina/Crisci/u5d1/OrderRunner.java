package Caterina.Crisci.u5d1;

import Caterina.Crisci.u5d1.models.Menu;
import Caterina.Crisci.u5d1.models.Ordine;
import Caterina.Crisci.u5d1.models.Pizza;
import Caterina.Crisci.u5d1.models.Tavolo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class OrderRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5d1Application.class)) {
            Menu menu = (Menu) context.getBean("menu");
            System.out.println(menu);

            Tavolo tavolo10 = (Tavolo) context.getBean("tavolo10");

            Ordine ordine1 = Ordine.builder()
                    .consumazioni(List.of((Pizza) context.getBean("Margherita"),(Pizza) context.getBean("viennese")))
                    .build();
            System.out.println(ordine1);
            System.out.println(ordine1.getTotale() + "euro");

        } catch (Exception exception) {
            System.err.println(exception.getMessage());

        }
    }
}
