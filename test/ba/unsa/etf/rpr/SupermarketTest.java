package ba.unsa.etf.rpr;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private Supermarket k;
    Artikl[] nizArtikala = new Artikl[1000];

    @BeforeEach
    void setUp() {
        k= new Supermarket();
        k.dodajArtikl(new Artikl("grah", 3, "1234"));
        k.dodajArtikl(new Artikl("senzacija", 1, "13"));
        k.dodajArtikl(new Artikl("sprite", 4, "123"));
        nizArtikala[0]= new Artikl("grah", 3, "1234");
        nizArtikala[1]= new Artikl("senzacija", 1, "13");
        nizArtikala[2]= new Artikl("sprite", 4, "123");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void dodajArtikl() {
        Supermarket pomocna = new Supermarket();
        pomocna.dodajArtikl(new Artikl("sok", 2, "1312"));
        Artikl[] pomocniNiz = new Artikl[1000];
        pomocniNiz[0]= new Artikl("sok", 2, "1312");
        assertArrayEquals(pomocniNiz, pomocna.getArtikli());
    }

    @Test
    void getArtikli() {
        assertArrayEquals(nizArtikala, k.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket pomocna = new Supermarket();
        pomocna.dodajArtikl(new Artikl("sok", 2, "1312"));
        pomocna.izbaciArtiklSaKodom("1312");
        Artikl[] pomocniNiz = new Artikl[1000];
        assertArrayEquals(pomocniNiz, pomocna.getArtikli());
    }
}