package ba.unsa.etf.rpr;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    private Artikl a = new Artikl("mlijeko", 1, "123");
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNaziv() {
        assertEquals("mlijeko", a.getNaziv());
    }

    @Test
    void getCijena() {
        assertEquals(1, a.getCijena());
    }

    @Test
    void getKod() {
        assertEquals("123", a.getKod());
    }
}