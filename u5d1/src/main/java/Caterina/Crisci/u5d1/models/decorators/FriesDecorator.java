package Caterina.Crisci.u5d1.models.decorators;

import jakarta.persistence.Entity;
import lombok.Getter;


@Getter
@Entity
public class FriesDecorator extends ToppingDecorator {
    public FriesDecorator() {
        super("fries", 0.50f);
    }

}
