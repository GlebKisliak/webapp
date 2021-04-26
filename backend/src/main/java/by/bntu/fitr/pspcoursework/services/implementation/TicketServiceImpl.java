package by.bntu.fitr.pspcoursework.services.implementation;

import by.bntu.fitr.pspcoursework.entity.Ticket;
import by.bntu.fitr.pspcoursework.repository.TicketRepo;
import by.bntu.fitr.pspcoursework.services.interfaces.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepo ticketRepo;
    @Override
    public Ticket create(Ticket ticket) {
        return ticketRepo.save(ticket);
    }

    @Override
    public Ticket findById(int id) {
        return ticketRepo.findById(id).get();
    }

    @Override
    public List<Ticket> findAll(int page, int size) {
        return ticketRepo.findAll(PageRequest.of(page, size)).getContent();
    }

    @Override
    public void deleteByID(int id) {
        ticketRepo.deleteById(id);

    }

    @Override
    public int getSize() {
        return (int) ticketRepo.count();
    }
}
