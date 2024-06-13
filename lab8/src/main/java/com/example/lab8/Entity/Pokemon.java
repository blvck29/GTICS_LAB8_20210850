package com.example.lab8.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pokemon")
public class Pokemon {
    @Id
    private Integer pokemonId;
    @Column(name = "name")
    private String name;
    @Column(name = "encounter")
    private String encounter;
    @Column(name = "prob")
    private String prob;
}
