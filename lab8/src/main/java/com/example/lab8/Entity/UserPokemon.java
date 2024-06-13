package com.example.lab8.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_has_pokemon")
public class UserPokemon {

    @EmbeddedId
    private UserPokemonId id;

    @MapsId("usuario")
    @ManyToOne
    @JoinColumn(name="userId")
    private User user;

    @MapsId("pokemon")
    @ManyToOne
    @JoinColumn(name="pokeId")
    private Pokemon poke;



}
