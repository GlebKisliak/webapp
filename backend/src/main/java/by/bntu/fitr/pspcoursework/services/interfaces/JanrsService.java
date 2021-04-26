package by.bntu.fitr.pspcoursework.services.interfaces;


import by.bntu.fitr.pspcoursework.entity.Janrs;

import java.util.List;

public interface JanrsService {
    Janrs create (Janrs janrs);
    Janrs findById(int id);
    List<Janrs> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
