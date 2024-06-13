package com.example.lab8.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_has_pokemon")
public class UserPokemon {

    @EmbeddedId
    private UserPokemonId id;

    @MapsId("iduser")
    @ManyToOne
    @JoinColumn(name="iduser")
    private User user;

    @MapsId("idpokemon")
    @ManyToOne
    @JoinColumn(name="idpokemon")
    private Pokemon pokemon;



}
