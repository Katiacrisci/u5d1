package Caterina.Crisci.u5d1.models.decorators;

import jakarta.persistence.Entity;
import lombok.Getter;


@Getter
@Entity
public class WurstelDecorator extends ToppingDecorator {
    public WurstelDecorator() {
        super("wurstel", 0.50f);

    }

}
