package Caterina.Crisci.u5d1.models.decorators;

import jakarta.persistence.Entity;
import lombok.Getter;


@Getter
@Entity

public class ProsciuttoDecorator extends ToppingDecorator{
    public ProsciuttoDecorator() {
        super("prosciutto", 0.50f);
    }
}
