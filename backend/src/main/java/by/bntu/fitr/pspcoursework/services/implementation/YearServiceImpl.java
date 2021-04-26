package by.bntu.fitr.pspcoursework.services.implementation;

import by.bntu.fitr.pspcoursework.entity.Year;
import by.bntu.fitr.pspcoursework.repository.YearRepo;
import by.bntu.fitr.pspcoursework.services.interfaces.YearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YearServiceImpl implements YearService {
    @Autowired
    private YearRepo yearRepo;

    @Override
    public Year create(Year year) {
        return yearRepo.save(year);
    }

    @Override
    public Year findById(int id) {
        return yearRepo.findById(id).get();
    }

    @Override
    public List<Year> findAll(int page, int size) {
        return yearRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        yearRepo.deleteById(id);

    }

    @Override
    public int getSize() {
        return (int) yearRepo.count();
    }
}
