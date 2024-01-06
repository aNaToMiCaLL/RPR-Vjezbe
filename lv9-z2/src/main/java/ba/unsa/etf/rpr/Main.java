package ba.unsa.etf.rpr;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        GeografijaDAO temp=new GeografijaDAO();
        temp.obrisiSve();
        temp.dodajDrzavu(new Drzava(1,"Francuska"));
        temp.dodajDrzavu(new Drzava(2,"Njemačka"));
        temp.dodajDrzavu(new Drzava(3,"Engleska"));
        temp.dodajGrad(new Grad(1,"Pariz",9000000,1));
        temp.postaviGlavniGrad("Francuska",1);
        temp.dodajGrad(new Grad(2,"Marsej",800000,1));
        temp.dodajGrad(new Grad(3,"Hamburg",2000000,2));
        temp.dodajGrad(new Grad(4,"Köln",1000000,2));
        temp.dodajGrad(new Grad(5,"Liverpool",816000,3));
        temp.dodajGrad(new Grad(7,"Berlin",3500000,2));
        temp.postaviGlavniGrad("Njemačka",7);
        ArrayList<Grad> gradovi=temp.gradovi();
        System.out.println("SVI GRADOVI:");
        for(Grad grad:gradovi)
        {
            System.out.println(grad.getNaziv()+" ("+temp.nadjiDrzavu(grad).getNaziv()+") - "+grad.getBrStanovnika());
        }
        System.out.println("\nGlavni grad Francuske je "+ temp.glavniGrad("Francuska").getNaziv());
        System.out.println("\nTražimo Njemačku u bazi");
        temp.nadjiDrzavu("Njemačka").Ispisi();
        System.out.println("\nBrišemo Francusku");
        temp.obrisiDrzavu("Francuska");
        gradovi=temp.gradovi();
        for(Grad grad:gradovi)
        {
            System.out.println(grad.getNaziv()+" ("+temp.nadjiDrzavu(grad).getNaziv()+") - "+grad.getBrStanovnika());
        }
    }
}