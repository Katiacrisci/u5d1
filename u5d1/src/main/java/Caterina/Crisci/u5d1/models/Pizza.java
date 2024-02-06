package Caterina.Crisci.u5d1.models;

import Caterina.Crisci.u5d1.decorators.ToppingDecorator;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class Pizza extends Consummation {

    private String name;
    private List<ToppingDecorator> toppings;
    private float price;
    public Pizza() {
        this.name = "Margherita";
        this.price = 5;

    }

    public float getPrice() {
      return toppings.stream().map(ToppingDecorator::getPrice).reduce(this.price, Float::sum);

    }
}
