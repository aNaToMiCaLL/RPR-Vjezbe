package ba.unsa.etf.rpr;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoSerializableFile implements LaptopDao{
    File file;
    ArrayList<Laptop> Laptopi;
    /*@Override
    void dodajLaptopUFile(Laptop laptop)
    {
        try
        {
            ObjectOutputStream unos=new ObjectOutputStream(new FileOutputStream(file));
            unos.writeObject(Laptopi);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/
}
