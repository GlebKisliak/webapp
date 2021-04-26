package by.bntu.fitr.pspcoursework.services.implementation;

import by.bntu.fitr.pspcoursework.entity.Movietheater;
import by.bntu.fitr.pspcoursework.repository.MovietheaterRepo;
import by.bntu.fitr.pspcoursework.services.interfaces.MovietheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovietheaterServiceImpl implements MovietheaterService {
    @Autowired
    private MovietheaterRepo movietheaterRepo;
    @Override
    public Movietheater create(Movietheater movietheater) {
        return movietheaterRepo.save(movietheater);
    }

    @Override
    public Movietheater findById(int id) {
        return movietheaterRepo.findById(id).get();
    }

    @Override
    public List<Movietheater> findAll(int page, int size) {
        return movietheaterRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        movietheaterRepo.deleteById(id);

    }

    @Override
    public int getSize() {
        return (int) movietheaterRepo.count();
    }
}
