package by.bntu.fitr.pspcoursework.services.interfaces;


import by.bntu.fitr.pspcoursework.entity.Films;

import java.util.List;

public interface FilmsService {
    Films create (Films films);
    Films findById(int id);
    List<Films> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
