package by.bntu.fitr.pspcoursework.services.implementation;

import by.bntu.fitr.pspcoursework.entity.Basket;
import by.bntu.fitr.pspcoursework.repository.BasketRepo;
import by.bntu.fitr.pspcoursework.services.interfaces.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    @Autowired
    private BasketRepo basketRepo;


    @Override
    public Basket create(Basket basket) {
        return basketRepo.save(basket);
    }

    @Override
    public Basket findById(int id) {
        return basketRepo.findById(id).get();
    }

    @Override
    public List<Basket> findAll(int page, int size) {
        return basketRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        basketRepo.deleteById(id);

    }

    @Override
    public int getSize() {
        return (int) basketRepo.count();
    }
}
