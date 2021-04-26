package by.bntu.fitr.pspcoursework.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "basket")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Basic
    @Column(name = "ticket_id", nullable = false)
    private Integer ticketId;


}
