package Caterina.Crisci.u5d1.decorators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class ToppingDecorator {

    private String name;
    private float price;

}
