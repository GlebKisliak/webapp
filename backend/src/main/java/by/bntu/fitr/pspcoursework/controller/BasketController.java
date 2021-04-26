package by.bntu.fitr.pspcoursework.controller;

import by.bntu.fitr.pspcoursework.entity.Basket;
import by.bntu.fitr.pspcoursework.services.implementation.BasketServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Api
@RestController
@RequestMapping("/basket")
@CrossOrigin(origins = "http://localhost:4200")
public class BasketController {
    @Autowired
    private BasketServiceImpl basketService;

    @PostMapping
    public Basket create(@RequestBody Basket basket){
        return basketService.create(basket);

    }

    @GetMapping("/{id}")
    public Basket findById(@PathVariable int id) {
        return basketService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Basket> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return basketService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        basketService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return basketService.getSize();
    }
}
