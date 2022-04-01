package fr.limayrac.Library.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "emprunt")
public class Emprunts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Livres livre;
}
