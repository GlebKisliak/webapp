package by.bntu.fitr.pspcoursework.controller;

import by.bntu.fitr.pspcoursework.entity.Basket;
import by.bntu.fitr.pspcoursework.entity.Films;
import by.bntu.fitr.pspcoursework.services.implementation.BasketServiceImpl;
import by.bntu.fitr.pspcoursework.services.implementation.FilmsServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/films")
@CrossOrigin(origins = "http://localhost:4200")
public class FilmsController {
    @Autowired
    private FilmsServiceImpl filmsService;

    @PostMapping
    public Films create(@RequestBody Films films){
        return filmsService.create(films);

    }

    @GetMapping("/{id}")
    public Films findById(@PathVariable int id) {
        return filmsService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Films> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return filmsService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        filmsService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return filmsService.getSize();
    }
}
