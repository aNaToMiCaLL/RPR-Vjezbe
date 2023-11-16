package ba.unsa.etf.rpr;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public interface LaptopDao {
    ArrayList<Laptop> laptops= null;
    File file = null;
    default void dodajLaptopUListu(Laptop laptop) {
        laptops.add(laptop);
    }

    ;

    default void dodajLaptopUFile(Laptop laptop) {
        try
        {
            ObjectOutputStream unos=new ObjectOutputStream(new FileOutputStream(file));
            unos.writeObject(laptop);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    ;

    default Laptop getLaptop(String procesor) {
        int n=laptops.size();
        for(int i=0;i<n;i++)
        {
            if(laptops.get(i).dajProcesor()==procesor) return laptops.get(i);
        }
        return null;
    }

    default void napuniListu(ArrayList<Laptop> laptopi) {
        int n=laptopi.size();
        for(int i=0;i<n;i++) {
            laptops.add(laptopi.get(i));
        }
    }

    ;

    default ArrayList<Laptop> vratiPodatkeIzDatoteke() {
        return null;
    }
};

