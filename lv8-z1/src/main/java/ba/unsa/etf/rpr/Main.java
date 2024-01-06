package ba.unsa.etf.rpr;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        GeografijaDAO temp=new GeografijaDAO();
        ArrayList<Grad> gradovi=temp.gradovi();
        for(Grad naziv:gradovi)
        {
            System.out.println(naziv.getNaziv()+" "+naziv.getBrStanovnika());
        }

    }
}