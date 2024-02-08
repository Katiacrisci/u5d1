package Caterina.Crisci.u5d1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor

public class Bevanda extends Consummation{


    private String name;
    private float price;
    private boolean isAlcoholic;

}
