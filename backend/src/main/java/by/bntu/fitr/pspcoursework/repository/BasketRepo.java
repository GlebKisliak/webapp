package by.bntu.fitr.pspcoursework.repository;

import by.bntu.fitr.pspcoursework.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepo extends JpaRepository<Basket, Integer> {
}
