package Caterina.Crisci.u5d1.decorators;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ProsciuttoDecorator extends ToppingDecorator{
    public ProsciuttoDecorator() {
        super("prosciutto", 0.50f);
    }
}
