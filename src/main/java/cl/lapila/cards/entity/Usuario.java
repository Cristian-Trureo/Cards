package cl.lapila.cards.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String rol;

    @Column(name = "contrasenia_hash", nullable = false, length = 128)
    private String contraseniaHash;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Card> listaCards;
}
