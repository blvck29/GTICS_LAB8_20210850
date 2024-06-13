package com.example.lab8.Repo;

import com.example.lab8.Entity.UserPokemon;
import com.example.lab8.Entity.UserPokemonId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPokemonRepo extends JpaRepository<UserPokemon,UserPokemonId> {
}
