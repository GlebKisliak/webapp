package by.bntu.fitr.pspcoursework.services.implementation;

import by.bntu.fitr.pspcoursework.entity.Janrs;
import by.bntu.fitr.pspcoursework.repository.JanrsRepo;
import by.bntu.fitr.pspcoursework.services.interfaces.JanrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JanrsServiceImpl implements JanrsService {
    @Autowired
    private JanrsRepo janrsRepo;

    @Override
    public Janrs create(Janrs janrs) {
        return janrsRepo.save(janrs);
    }

    @Override
    public Janrs findById(int id) {
        return janrsRepo.findById(id).get();
    }

    @Override
    public List<Janrs> findAll(int page, int size) {
        return janrsRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        janrsRepo.deleteById(id);

    }

    @Override
    public int getSize() {
        return (int) janrsRepo.count();
    }
}
