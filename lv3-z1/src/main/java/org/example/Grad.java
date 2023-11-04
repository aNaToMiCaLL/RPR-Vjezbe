package org.example;

public enum Grad {
    Travnik("Travnik"),//do 11 je 030
    Orašje("Orašje"),
     Zenica("Zenica"),  //do 26 032

    Sarajevo("Sarajevo"), //do 35 033
     Livno("Livno"),   //do 41 034
     Tuzla("Tuzla"),  //035
    Mostar("Mostar"), //036
    Bihać("Bihać"), //037
    Goražde("Goražde"),//038
    ŠirokiBrijeg("Široki Brijeg");//039


    private String ime="";
    private Grad(String ime)
    {
        this.ime=ime;
    }
    @Override
    public String toString()
    {
        return this.ime;
    }
    public String dajBroj()
    {
        if(this==Travnik) return "030";
        else if(this==Orašje) return "031";
        else if(this==Zenica) return "032";
        else if(this==Sarajevo) return "033";
        else if(this==Livno) return "034";
        else if(this==Tuzla) return "035";
        else if(this==Mostar) return "036";
        else if(this==Bihać) return "037";
        else if(this==Goražde) return "038";
        else if(this==ŠirokiBrijeg) return "039";
        else return "";
    }
}
