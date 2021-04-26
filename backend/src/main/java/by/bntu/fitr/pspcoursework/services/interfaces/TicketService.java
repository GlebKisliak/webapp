package by.bntu.fitr.pspcoursework.services.interfaces;


import by.bntu.fitr.pspcoursework.entity.Ticket;

import java.util.List;

public interface TicketService {
    Ticket create (Ticket ticket);
    Ticket findById(int id);
    List<Ticket> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
