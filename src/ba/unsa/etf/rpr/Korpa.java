package ba.unsa.etf.rpr;
import java.util.ArrayList;

public class Korpa {
    private Artikl[] artikli;
    private int brojArtikala;

    private Artikl[] izbaciArtikl(int i) {
        if(i >= brojArtikala || i < 0 || artikli == null) return artikli;

        Artikl[] noviArtikli = new Artikl[50];
        System.arraycopy(artikli, 0, noviArtikli, 0, i);
        System.arraycopy(artikli, i + 1, noviArtikli, i, brojArtikala - i - 1);

        brojArtikala--;
        return noviArtikli;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Korpa() {
        artikli= new Artikl[50];
        brojArtikala=0;
    }
    public boolean dodajArtikl(Artikl a) {
        if(brojArtikala<50)
            artikli[brojArtikala]= new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
        else return false;
        brojArtikala++;
        return true;
    }
    public Artikl izbaciArtiklSaKodom(String kodZaIzbacivanje) {
        Artikl povratni=null;
        for(int i = 0; i < brojArtikala; i++) {
            if(artikli[i].getKod().equals(kodZaIzbacivanje)) {
                povratni=artikli[i];
                artikli = izbaciArtikl(i);
                break;
            }
        }
        return povratni;
    }
    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for(int i = 0; i < brojArtikala; i++) {
            suma+=artikli[i].getCijena();
        }
        return suma;
    }
}
