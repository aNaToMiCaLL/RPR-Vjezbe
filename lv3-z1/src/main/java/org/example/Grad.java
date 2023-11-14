package org.example;

public enum Grad {

    Travnik("030"),//do 11 je 030
    Orašje("031"),
     Zenica("032"),  //do 26 032

    Sarajevo("033"), //do 35 033
     Livno("034"),   //do 41 034
     Tuzla("035"),  //035
    Mostar("036"), //036
    Bihać("037"), //037
    Goražde("038"),//038
    ŠirokiBrijeg("039");//039


    private String pozivniBroj;

    Grad(String number) {
        pozivniBroj=number;
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
    public String getPozivniBroj() {
        return pozivniBroj;
    }
    public static Grad izPozivnog(String pozivni){
        for(Grad g : Grad.values()){
            if(g.getPozivniBroj().equals(pozivni))
                return g;
        }
        return null;
    }
}
