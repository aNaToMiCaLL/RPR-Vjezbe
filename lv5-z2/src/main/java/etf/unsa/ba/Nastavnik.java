package etf.unsa.ba;

import java.util.ArrayList;

public class Nastavnik extends LicneInformacije{
    //String ime,prezime;
    String titula;
    ArrayList<Ocjena> Ocjene=new ArrayList<>();
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
        return "\nNastavnik\nIme:"+getIme()+"\nPrezime:"+getPrezime()+"\nTitula:"
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
