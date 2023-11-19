package etf.unsa.ba;

public class Nastavnik extends LicneInformacije{
    String ime,prezime,titula;

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
    @Override
    public String toString()
    {
        return "\nNastavnik\nIme:"+ime+"\nPrezime:"+prezime+"\nTitula:"
                +titula;
    }
}
