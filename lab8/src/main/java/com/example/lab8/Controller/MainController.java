package com.example.lab8.Controller;

import com.example.lab8.Dao.AreaDao;
import com.example.lab8.Dao.LocationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller(value = "/api/pokeapi")
public class MainController {


    @Autowired
    LocationDao locationDao;

    @Autowired
    AreaDao areaDao;

    @GetMapping("/location")
    public String getLocation(@RequestParam("id") String idOrName){
        return locationDao.getPokemonEncounters(idOrName);
    }

    @GetMapping("/area")
    public String getArea(@RequestParam("id") String idOrName){
        return areaDao.getLocationAreaEncounter(idOrName);
    }

}
