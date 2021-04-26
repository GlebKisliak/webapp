package by.bntu.fitr.pspcoursework.services.interfaces;


import by.bntu.fitr.pspcoursework.entity.Year;

import java.util.List;

public interface YearService {
    Year create (Year year);
    Year findById(int id);
    List<Year> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
