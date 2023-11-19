package etf.unsa.ba;

public class Ocjena implements MozeOcijeniti{
    int ocjena;
    Student osoba;
    public Ocjena(Student osoba,int ocjena)
    {
        setOcjena(ocjena);
        this.osoba=osoba;

    }
    void setOcjena(int x)
    {
        if(x>4 && x<=10) ocjena=x;
        else {
            System.out.println("Neispravna ocjena!");
        }
    }
    @Override
    public void ocijeni(int x)
    {
        setOcjena(x);
    }
    public void ispisi()
    {
        System.out.println(osoba.getIme()+" "+osoba.getPrezime()+"\nOcjena: "+ocjena);
    }
}
