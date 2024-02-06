package Caterina.Crisci.u5d1.decorators;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class WurstelDecorator extends ToppingDecorator {
    public WurstelDecorator() {
        super("wurstel", 0.50f);

    }

}
