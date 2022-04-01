package fr.limayrac.Library.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "emprunt")
public class Emprunts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_emprunt")
    private Date dateEmprunt;

    @Column(name = "date_rendu")
    private Date dateRendu;

    @ManyToOne
    @JoinColumn(name = "idLivre")
    private Livres livre;

    @ManyToOne
    @JoinColumn(name = "idUsers")
    private Users user;
}
