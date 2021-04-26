package by.bntu.fitr.pspcoursework.controller;

import by.bntu.fitr.pspcoursework.entity.Role;
import by.bntu.fitr.pspcoursework.entity.Year;
import by.bntu.fitr.pspcoursework.services.implementation.RoleServiceImpl;
import by.bntu.fitr.pspcoursework.services.implementation.YearServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/year")
@CrossOrigin(origins = "http://localhost:4200")
public class YearController {
    @Autowired
    private YearServiceImpl yearService;

    @PostMapping
    public Year create(@RequestBody Year year){
        return yearService.create(year);

    }

    @GetMapping("/{id}")
    public Year findById(@PathVariable int id) {
        return yearService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Year> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return yearService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        yearService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return yearService.getSize();
    }
}
