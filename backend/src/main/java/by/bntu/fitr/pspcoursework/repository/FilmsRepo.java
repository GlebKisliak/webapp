package by.bntu.fitr.pspcoursework.repository;

import by.bntu.fitr.pspcoursework.entity.Films;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmsRepo extends JpaRepository<Films, Integer> {
}
