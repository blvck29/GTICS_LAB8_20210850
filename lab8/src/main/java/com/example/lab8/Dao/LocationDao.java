package com.example.lab8.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Component
public class LocationDao {

    public String getPokemonEncounters(String idOrName) {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://pokeapi.co/api/v2/pokemon/" + idOrName + "/encounters";
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);
        return response.getBody();
    }

}
