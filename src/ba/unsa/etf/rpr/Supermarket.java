package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli;
    private int brojArtikala;
    public Supermarket(){
        artikli = new Artikl[1000];
        brojArtikala=0;
    }
    public boolean dodajArtikl(Artikl a) {
        if(brojArtikala<1000)
            artikli[brojArtikala] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        else return false;
        brojArtikala++;
        return true;
    }

    private Artikl[] izbaciArtikl(int i) {
        if(i >= brojArtikala || i < 0 || artikli == null) return artikli;

        Artikl[] noviArtikli;
        noviArtikli = new Artikl[1000];
        System.arraycopy(artikli, 0, noviArtikli, 0, i);
        System.arraycopy(artikli, i + 1, noviArtikli, i, brojArtikala - i - 1);

        brojArtikala--;
        return noviArtikli;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kodZaIzbacivanje) {
        Artikl povratni=null;
        for(int i = 0; i < brojArtikala; i++) {
            if(artikli[i].getKod().equals(kodZaIzbacivanje)) {
                povratni = new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                artikli = izbaciArtikl(i);
                break;
            }
        }
        return povratni;
    }
}
