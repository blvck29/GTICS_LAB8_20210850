package com.example.lab8.Controller;

import com.example.lab8.Dao.AreaDao;
import com.example.lab8.Dao.LocationDao;
import com.example.lab8.Entity.Pokemon;
import com.example.lab8.Entity.User;
import com.example.lab8.Entity.UserPokemon;
import com.example.lab8.Entity.UserPokemonId;
import com.example.lab8.Repo.PokemonRepo;
import com.example.lab8.Repo.UserPokemonRepo;
import com.example.lab8.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/pokeapi")
public class MainController {

    final PokemonRepo pokemonRepo;
    final UserRepo userRepo;
    final UserPokemonRepo userPokemonRepo;

    @Autowired
    LocationDao locationDao;

    @Autowired
    AreaDao areaDao;

    public MainController(PokemonRepo pokemonRepo, UserRepo userRepo, UserPokemonRepo userPokemonRepo) {
        this.pokemonRepo = pokemonRepo;
        this.userRepo = userRepo;
        this.userPokemonRepo = userPokemonRepo;
    }

    @GetMapping("/location")
    public String getLocation(@RequestParam("id") String idOrName){
        return locationDao.getPokemonEncounters(idOrName);
    }

    @GetMapping("/area")
    public String getArea(@RequestParam("id") String idOrName){
        return areaDao.getLocationAreaEncounter(idOrName);
    }

    @GetMapping("/list")
    public String pokeList(Model model){

        List<UserPokemon> pokeTeam = userPokemonRepo.findAll();
        User user = (User) userRepo.findById(1);

        model.addAttribute("pokeTeam", pokeTeam);
        model.addAttribute("user", user);
        return "index";
    }



}
