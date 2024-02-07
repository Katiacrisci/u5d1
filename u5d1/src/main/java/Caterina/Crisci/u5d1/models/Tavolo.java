package Caterina.Crisci.u5d1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Tavolo {

    private int numero;
    private int coperti;
    private boolean isFree;
    private Ordine ordine;
}
