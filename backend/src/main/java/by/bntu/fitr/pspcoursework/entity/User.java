package by.bntu.fitr.pspcoursework.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "login", nullable = false)
    private String login;

    @Basic
    @Column(name = "password", nullable = false)
    private String password;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "surname", nullable = false)
    private String surname;

    @Basic
    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Basic
    @Column(name = "role_id", nullable = false)
    private Integer roleId;
}
