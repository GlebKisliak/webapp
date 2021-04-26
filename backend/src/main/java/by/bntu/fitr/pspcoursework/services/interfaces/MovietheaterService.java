package by.bntu.fitr.pspcoursework.services.interfaces;

import by.bntu.fitr.pspcoursework.entity.Movietheater;

import java.util.List;

public interface MovietheaterService {
    Movietheater create (Movietheater movietheater);
    Movietheater findById(int id);
    List<Movietheater> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
