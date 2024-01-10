package ba.unsa.etf.rpr.demo1;

import java.sql.*;
import java.util.ArrayList;

public class GeografijaDAO {
    Connection con;
    public GeografijaDAO() throws SQLException {
        con = DriverManager.getConnection("jdbc:sqlite::resource:baza.db");
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
    public Grad glavniGrad(String drzava) throws SQLException {
        PreparedStatement upit=con.prepareStatement("Select gr.id,gr.naziv,gr.broj_stanovnika,gr.drzava "+
                "FROM grad gr,drzava dr WHERE gr.drzava=dr.id and dr.naziv=? and dr.glavni_grad=gr.id;");
        upit.setString(1,drzava);
        ResultSet rezultat=upit.executeQuery();
        if(!rezultat.isBeforeFirst()) return null;
         return new Grad(rezultat.getInt(1),rezultat.getString(2),rezultat.getInt(3),rezultat.getInt(4));
    }
    public void obrisiDrzavu(String drzava) throws SQLException
    {
        Drzava temp=nadjiDrzavu(drzava);
        PreparedStatement upit=con.prepareStatement("DELETE FROM drzava WHERE id="+temp.getId()+";");
        PreparedStatement upit1=con.prepareStatement("DELETE FROM grad where drzava="+temp.getId()+";");
        upit1.executeUpdate();
        upit.executeUpdate();
    }
    public void dodajGrad(Grad grad) throws SQLException
    {
        PreparedStatement upit=con.prepareStatement("INSERT INTO grad VALUES(?,?,?,?)");
        upit.setInt(1,grad.getId());
        upit.setString(2, grad.getNaziv());
        upit.setInt(3,grad.getBrStanovnika());
        upit.setInt(4,grad.getDrzavaID());
        upit.executeUpdate();
    }
    public void dodajDrzavu(Drzava drzava) throws SQLException {
        PreparedStatement upit=con.prepareStatement("INSERT INTO drzava VALUES(?,?,?)");
        upit.setInt(1,drzava.getId());
        upit.setString(2, drzava.getNaziv());
        if(drzava.getGlavniGradID()!=-1)upit.setInt(3,drzava.getGlavniGradID());
        else upit.setNull(3,Types.INTEGER);
        upit.executeUpdate();
    }
    public Drzava nadjiDrzavu(String drzava) throws SQLException {
        PreparedStatement upit=con.prepareStatement("SELECT * from drzava where naziv=\""+drzava+"\";");
        ResultSet konacni=upit.executeQuery();
        if(!konacni.isBeforeFirst()) return null;
        return new Drzava(konacni.getInt(1),konacni.getString(2),konacni.getInt(3));
    }
    public Drzava nadjiDrzavu(Grad grad) throws SQLException
    {
        PreparedStatement upit=con.prepareStatement("SELECT * from drzava dr,grad gr where gr.drzava=dr.id and gr.id="+grad.getId());
        ResultSet konacni=upit.executeQuery();
        if(!konacni.isBeforeFirst()) return null;
        return new Drzava(konacni.getInt(1),konacni.getString(2),konacni.getInt(3));
    }
    public void postaviGlavniGrad(String drzava,int grad) throws SQLException
    {
        PreparedStatement upit=con.prepareStatement("UPDATE drzava set glavni_grad="+grad+" where naziv=\""+drzava+"\";");
        upit.executeUpdate();
    }
    public void obrisiSve() throws SQLException
    {
        PreparedStatement upit=con.prepareStatement("DELETE FROM drzava;");
        PreparedStatement upit1=con.prepareStatement("DELETE FROM grad;");
        upit.executeUpdate();
        upit1.executeUpdate();
    }

}


