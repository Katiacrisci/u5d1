package Caterina.Crisci.u5d1.repository;

import Caterina.Crisci.u5d1.models.Consummation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConsummationRepository extends JpaRepository<Consummation, Long> {

    Optional<Consummation> findById(Long id);

    List<Consummation> findAll();

    Optional<Consummation> findByNameAndPrice(String name, float price);
}
