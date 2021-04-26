package by.bntu.fitr.pspcoursework.services.interfaces;

import by.bntu.fitr.pspcoursework.entity.Basket;


import java.util.List;

public interface BasketService {
    Basket create (Basket basket);
    Basket findById(int id);
    List<Basket> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
