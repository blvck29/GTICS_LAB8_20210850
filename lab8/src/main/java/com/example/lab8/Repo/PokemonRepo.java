package com.example.lab8.Repo;

import com.example.lab8.Entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepo extends JpaRepository<Pokemon,Integer> {
}
