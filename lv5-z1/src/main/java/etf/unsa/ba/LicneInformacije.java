package etf.unsa.ba;

abstract public class LicneInformacije {
    private String ime,prezime;
    void setIme(String ime){this.ime=ime;};
    void setPrezime(String prezime){this.prezime=prezime;};
    String getIme(){return ime;};
    String getPrezime(){return prezime;};
}
