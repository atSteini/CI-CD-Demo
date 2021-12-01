package at.htlklu.ccdbackend.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.github.javafaker.Animal;
import com.github.javafaker.Beer;
import com.github.javafaker.Faker;
import com.github.javafaker.Pokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class DemoController {
    ObjectMapper objectMapper;
    Faker faker;

    public DemoController() {
        objectMapper = new ObjectMapper();
        faker = new Faker(new Locale("de"));
    }

    @GetMapping(value = "version")
    public String getVersion() {
        return "Version 1.0";
    }

    @GetMapping(value = "pokemon")
    public JsonNode getPokemon() {
        ArrayNode pokemons = objectMapper.createArrayNode();

        for (int i = 0; i < 10; i++) {
            Pokemon pokemon = faker.pokemon();
            pokemons.add(objectMapper.createObjectNode()
                    .put("name", pokemon.name())
                    .put("location", pokemon.location()));
        }

        return pokemons;
    }

    @GetMapping(value = "beers")
    public JsonNode getBeers() {
        ArrayNode beers = objectMapper.createArrayNode();

        for (int i = 0; i < 10; i++) {
            Beer beer = faker.beer();
            beers.add(objectMapper.createObjectNode()
                    .put("name", beer.name())
                    .put("style", beer.style())
                    .put("yeast", beer.yeast())
                    .put("hop", beer.hop()));
        }

        return beers;
    }
}
