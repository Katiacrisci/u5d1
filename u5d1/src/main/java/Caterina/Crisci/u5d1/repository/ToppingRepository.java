package Caterina.Crisci.u5d1.repository;

import Caterina.Crisci.u5d1.models.decorators.ToppingDecorator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<ToppingDecorator, Long> {


}
