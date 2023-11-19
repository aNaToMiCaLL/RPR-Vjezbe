package etf.unsa.ba;

import java.util.ArrayList;

public class Predmet {
    String nazivPredmeta,opisPredmeta;
    ArrayList<Ocjena> Ocjene;

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getOpisPredmeta() {
        return opisPredmeta;
    }

    public void setOpisPredmeta(String opisPredmeta) {
        this.opisPredmeta = opisPredmeta;
    }
    public void dodajOcjenu(Student osoba,int x)
    {
        Ocjene.add(new Ocjena(osoba,x));
    }
    public void ispisiSveOcjene()
    {
        for(Ocjena i:Ocjene)
        {
            i.ispisi();
        }
    }
}
