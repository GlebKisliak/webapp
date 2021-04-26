package by.bntu.fitr.pspcoursework.repository;

import by.bntu.fitr.pspcoursework.entity.Janrs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JanrsRepo extends JpaRepository<Janrs, Integer> {
}
