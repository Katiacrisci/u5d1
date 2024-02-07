package Caterina.Crisci.u5d1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Menu {
    private List<Pizza> pizzas;
    private List<Bevanda> bevande;
    private int calories;

    public Menu() {


    }



}
