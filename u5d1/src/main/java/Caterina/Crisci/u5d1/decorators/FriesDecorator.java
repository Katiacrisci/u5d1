package Caterina.Crisci.u5d1.decorators;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter


public class FriesDecorator extends ToppingDecorator {
    public FriesDecorator() {
        super("fries", 0.50f);
    }

}
