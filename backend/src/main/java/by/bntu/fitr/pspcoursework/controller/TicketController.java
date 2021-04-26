package by.bntu.fitr.pspcoursework.controller;

import by.bntu.fitr.pspcoursework.entity.Ticket;
import by.bntu.fitr.pspcoursework.services.implementation.TicketServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/ticket")
@CrossOrigin(origins = "http://localhost:4200")
public class TicketController {
    @Autowired
    private TicketServiceImpl ticketService;

    @PostMapping
    public Ticket create(@RequestBody Ticket ticket){
        return ticketService.create(ticket);

    }

    @GetMapping("/{id}")
    public Ticket findById(@PathVariable int id) {
        return ticketService.findById(id);
    }

    @GetMapping("/find-all")
    public List<Ticket> findAll(@RequestParam int pageNo, @RequestParam int pageSize){
        return ticketService.findAll(pageNo,pageSize);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable int id){
        ticketService.deleteByID(id);
    }

    @GetMapping("/size")
    public int getSize() {
        return ticketService.getSize();
    }
}
