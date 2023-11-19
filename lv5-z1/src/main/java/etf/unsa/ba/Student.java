package etf.unsa.ba;

public class Student extends LicneInformacije{
    String ime,prezime,godinaStudija,brojIndexa;

    @Override
    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    @Override
    public String getIme() {
        return ime;
    }

    @Override
    public String getPrezime() {
        return prezime;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }
    @Override
    public String toString()
    {
       return "\nStudent\nIme:"+ime+"\nPrezime:"+prezime+"\nGodina studija:"
       +godinaStudija+"\nBroj indexa:"+brojIndexa;
    }
}
