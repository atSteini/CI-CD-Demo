package at.htlklu.ccdbackend;

import at.htlklu.ccdbackend.api.DemoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CcdBackendApplicationTests {

    @Autowired
    DemoController demoController;

    //TODO: Write tests

    /*
    @Test
    void versionTest() {
        assertEquals("Version 1.0", demoController.getVersion());
    }

    @Test
    void pokemonLengthTest() {
        Integer pokemonSize = demoController.getPokemon().size();
        assertEquals(10, pokemonSize);
    }

    @Test
    void beerLengthTest() {
        Integer beerSize = demoController.getBeers().size();
        assertEquals(10, beerSize);
    }
     */
}
