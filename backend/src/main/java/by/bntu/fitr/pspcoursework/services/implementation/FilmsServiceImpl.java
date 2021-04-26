package by.bntu.fitr.pspcoursework.services.implementation;

import by.bntu.fitr.pspcoursework.entity.Films;
import by.bntu.fitr.pspcoursework.repository.FilmsRepo;
import by.bntu.fitr.pspcoursework.services.interfaces.FilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmsServiceImpl implements FilmsService {
    @Autowired
    private FilmsRepo filmsRepo;

    @Override
    public Films create(Films films){ return filmsRepo.save(films);}

    @Override
    public Films findById(int id) { return filmsRepo.findById(id).get();}

    @Override
    public List<Films> findAll(int page, int size) {
        return filmsRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        filmsRepo.deleteById(id);
    }

    @Override
    public int getSize(){ return (int) filmsRepo.count();}
}
