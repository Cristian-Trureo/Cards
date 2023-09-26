package cl.lapila.cards.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "card")
public class Card {

    @Id
    @Column(name = "card_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCard;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(length = 100)
    private String descripcion;

    @Column(length = 7)
    private String color;

    @Column(length = 20)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "user_email")
    private Usuario usuario;

    @Column(name = "fecha_creacion", nullable = false)
    private Timestamp fechaCreacion;
}
