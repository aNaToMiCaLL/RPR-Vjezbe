package etf.unsa.ba;

import java.util.ArrayList;

public class Nastavnik extends LicneInformacije{
    //String ime,prezime;
    String titula;

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    @Override
    public String toString()
    {
        return "\nNastavnik\nIme:"+getIme()+"\nPrezime:"+getPrezime()+"\nTitula:"
                +titula;
    }
}
