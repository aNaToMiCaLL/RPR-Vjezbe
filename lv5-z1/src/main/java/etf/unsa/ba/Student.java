package etf.unsa.ba;

public class Student extends LicneInformacije{
    String godinaStudija,brojIndexa;

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
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
       return "\nStudent\nIme:"+getIme()+"\nPrezime:"+getPrezime()+"\nGodina studija:"
       +godinaStudija+"\nBroj indexa:"+brojIndexa;
    }
}
