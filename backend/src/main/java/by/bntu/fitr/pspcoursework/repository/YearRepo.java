package by.bntu.fitr.pspcoursework.repository;

import by.bntu.fitr.pspcoursework.entity.Year;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearRepo extends JpaRepository<Year, Integer> {
}
