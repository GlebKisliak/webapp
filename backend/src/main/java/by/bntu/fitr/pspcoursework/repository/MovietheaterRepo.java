package by.bntu.fitr.pspcoursework.repository;

import by.bntu.fitr.pspcoursework.entity.Movietheater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovietheaterRepo extends JpaRepository<Movietheater, Integer> {
}
