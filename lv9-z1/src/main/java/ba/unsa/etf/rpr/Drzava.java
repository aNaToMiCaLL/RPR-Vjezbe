package ba.unsa.etf.rpr;

public class Drzava {
    private int id,glavniGradID;
    private String naziv;

    public Drzava(){};
    public Drzava(int id,String naziv,int glavniGradID)
    {
        this.id=id;
        this.naziv=naziv;
        this.glavniGradID=glavniGradID;
    }
    public Drzava(int glavniGradID) {
        this.glavniGradID = glavniGradID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGlavniGradID() {
        return glavniGradID;
    }

    public void setGlavniGradID(int glavniGradID) {
        this.glavniGradID = glavniGradID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
