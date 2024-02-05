package Caterina.Crisci.u5d1.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Builder
public class Pizza {

    private String name;
    private List<Topping> toppings;
    private float price;

}
