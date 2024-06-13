package com.example.lab8.Dao;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AreaDao {

    public String getLocationAreaEncounter(String idOrName) {

        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://pokeapi.co/api/v2/location-area/" + idOrName;
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);
        return response.getBody();
    }

}
