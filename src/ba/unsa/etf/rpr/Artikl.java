package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv, kod;
    private int cijena;

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
