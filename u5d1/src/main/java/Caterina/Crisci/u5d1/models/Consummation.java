package Caterina.Crisci.u5d1.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Consummation {
    private String name;

    public abstract float getPrice();





}
