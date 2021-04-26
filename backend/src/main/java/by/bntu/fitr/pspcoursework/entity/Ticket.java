package by.bntu.fitr.pspcoursework.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "time", nullable = false)
    private String time;

    @Basic
    @Column(name = "movietheater_id", nullable = false)
    private Integer movietheaterId;

    @Basic
    @Column(name = "films_id", nullable = false)
    private Integer filmsId;


    @Basic
    @Column(name = "price", nullable = false)
    private String price;
}
