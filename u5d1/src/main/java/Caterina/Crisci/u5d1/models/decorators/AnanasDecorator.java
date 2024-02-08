package Caterina.Crisci.u5d1.models.decorators;

import jakarta.persistence.Entity;

@Entity
public class AnanasDecorator extends ToppingDecorator{
    public AnanasDecorator() {
        super("Ananas", 0.60f);
    }
}
