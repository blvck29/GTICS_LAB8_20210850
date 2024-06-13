package com.example.lab8.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class UserPokemonId implements Serializable {
    @Column(name = "iduser", nullable = false)
    private Integer idUser;

    @Column(name = "idpokemon", nullable = false)
    private Integer idPokemon;
}
