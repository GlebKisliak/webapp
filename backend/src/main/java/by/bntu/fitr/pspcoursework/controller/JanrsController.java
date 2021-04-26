package by.bntu.fitr.pspcoursework.controller;

import by.bntu.fitr.pspcoursework.entity.Janrs;
import by.bntu.fitr.pspcoursework.services.implementation.JanrsServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api
@RestController
@RequestMapping("/janrs")
@CrossOrigin(origins = "http://localhost:4200")
public class JanrsController {
    @Autowired
    private JanrsServiceImpl janrsService;

    @PostMapping
    public Janrs create(@RequestBody Janrs janrs){
        return janrsService.create(janrs);

    }

    @GetMapping("/{id}")
    public Janrs findById(@PathVariable int id) {
        return janrsService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Janrs> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return janrsService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        janrsService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return janrsService.getSize();
    }
}
