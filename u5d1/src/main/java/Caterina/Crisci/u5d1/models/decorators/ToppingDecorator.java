package Caterina.Crisci.u5d1.models.decorators;

import jakarta.persistence.*;
import lombok.*;

@Getter
@ToString
@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class ToppingDecorator {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private float price;

    public ToppingDecorator(String name, float price) {
        this.name = name;
        this.price = price;
    }
}
