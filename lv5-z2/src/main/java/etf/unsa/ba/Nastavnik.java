package etf.unsa.ba;

import java.util.ArrayList;

public class Nastavnik extends LicneInformacije{
    String ime,prezime,titula;
    ArrayList<Ocjena> Ocjene=new ArrayList<>();
    @Override
    public String getIme() {
        return ime;
    }

    @Override
    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String getPrezime() {
        return prezime;
    }

    @Override
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }
    public void dodajOcjenu(Student osoba,int x)
    {
        Ocjene.add(new Ocjena(osoba,x));
    }
    @Override
    public String toString()
    {
        return "\nNastavnik\nIme:"+ime+"\nPrezime:"+prezime+"\nTitula:"
                +titula;
    }
    public void ispisiSveOcjene()
    {
        for(Ocjena i:Ocjene)
        {
            i.ispisi();
        }
    }
}
