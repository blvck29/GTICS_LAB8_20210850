package com.example.lab8.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class UserPokemonId implements Serializable {
    @Column(name = "userId", nullable = false)
    private Integer usuario;

    @Column(name = "pokeId", nullable = false)
    private Integer pokemon;

}
