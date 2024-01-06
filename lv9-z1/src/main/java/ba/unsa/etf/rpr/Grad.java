package ba.unsa.etf.rpr;

public class Grad {
    private int id,brStanovnika,drzavaID;
    private String naziv;
    Grad(){};
    Grad(int id,String naziv,int brStanovnika,int drzavaID)
    {
        this.id=id;
        this.naziv=naziv;
        this.brStanovnika=brStanovnika;
        this.drzavaID=drzavaID;
    }
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrStanovnika() {
        return brStanovnika;
    }

    public void setBrStanovnika(int brStanovnika) {
        this.brStanovnika = brStanovnika;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrzavaID() {
        return drzavaID;
    }

    public void setDrzavaID(int drzavaID) {
        this.drzavaID = drzavaID;
    }
}
