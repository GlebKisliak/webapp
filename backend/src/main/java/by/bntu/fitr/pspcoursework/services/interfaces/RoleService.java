package by.bntu.fitr.pspcoursework.services.interfaces;


import by.bntu.fitr.pspcoursework.entity.Role;

import java.util.List;

public interface RoleService {
    Role create (Role role);
    Role findById(int id);
    List<Role> findAll(int page, int size);
    void deleteByID(int id);
    int getSize();
}
