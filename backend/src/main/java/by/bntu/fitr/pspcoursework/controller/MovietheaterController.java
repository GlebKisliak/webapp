package by.bntu.fitr.pspcoursework.controller;

import by.bntu.fitr.pspcoursework.entity.Janrs;
import by.bntu.fitr.pspcoursework.entity.Movietheater;
import by.bntu.fitr.pspcoursework.services.implementation.JanrsServiceImpl;
import by.bntu.fitr.pspcoursework.services.implementation.MovietheaterServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api
@RestController
@RequestMapping("/movietheater")
@CrossOrigin(origins = "http://localhost:4200")
public class MovietheaterController {
    @Autowired
    private MovietheaterServiceImpl movietheaterService;

    @PostMapping
    public Movietheater create(@RequestBody Movietheater movietheater){
        return movietheaterService.create(movietheater);

    }

    @GetMapping("/{id}")
    public Movietheater findById(@PathVariable int id) {
        return movietheaterService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Movietheater> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return movietheaterService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        movietheaterService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return movietheaterService.getSize();
    }
}
