package ba.unsa.etf.rpr;

import java.sql.*;
import java.util.ArrayList;

public class GeografijaDAO {
    Connection con;
    public GeografijaDAO() throws SQLException {
        con = DriverManager.getConnection("jdbc:sqlite::resource:baza.db");
        PreparedStatement upit=con.prepareStatement("INSERT INTO grad VALUES(3,'Ilidža',3700,1)");
        //upit.executeUpdate();
    }
    public ArrayList<Grad> gradovi() throws SQLException {
        {
            PreparedStatement upit=con.prepareStatement("SELECT * FROM grad ORDER BY broj_stanovnika DESC");
            ResultSet sve=upit.executeQuery();
            ArrayList<Grad> konacni=new ArrayList<>();
            while(sve.next())
            {
                konacni.add(new Grad(sve.getInt(1),sve.getString(2),sve.getInt(3),sve.getInt(4)));
            }
            return konacni;
        }
    }
}

