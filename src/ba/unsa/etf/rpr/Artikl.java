package ba.unsa.etf.rpr;

import java.util.Objects;

public class Artikl {
    private String naziv, kod;
    private int cijena;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artikl artikl = (Artikl) o;
        return cijena == artikl.cijena && naziv.equals(artikl.naziv) && kod.equals(artikl.kod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naziv, kod, cijena);
    }

    public Artikl(String naziv, int cijena, String kod) { postaviArtikl(naziv, cijena, kod); }
    private void postaviArtikl(String naziv, int cijena, String kod) {
        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}
