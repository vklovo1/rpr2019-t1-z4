package ba.unsa.etf.rpr;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa k;
    Artikl[] nizArtikala = new Artikl[50];

    @BeforeEach
    void setUp() {
        k= new Korpa();
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
    void getArtikli() {

    }

    @Test
    void dodajArtikl() {
        Korpa pomocna = new Korpa();
        pomocna.dodajArtikl(new Artikl("sok", 2, "1312"));
        Artikl[] pomocniNiz = new Artikl[50];
        pomocniNiz[0]= new Artikl("sok", 2, "1312");
        assertArrayEquals(pomocniNiz, pomocna.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa pomocna = new Korpa();
        pomocna.dodajArtikl(new Artikl("sok", 2, "1312"));
        pomocna.izbaciArtiklSaKodom("1312");
        Artikl[] pomocniNiz = new Artikl[50];
        assertArrayEquals(pomocniNiz, pomocna.getArtikli());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        assertEquals(8, k.dajUkupnuCijenuArtikala());
    }
}