package by.bntu.fitr.pspcoursework.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "films")
public class Films {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;

        @Basic
        @Column(name = "name", nullable = false)
        private String name;

        @Basic
        @Column(name = "description", nullable = false)
        private String description;

        @Basic
        @Column(name = "year_id", nullable = false)
        private Integer yearId;

        @Basic
        @Column(name = "janrs_id", nullable = false)
        private Integer janrsId;








}
