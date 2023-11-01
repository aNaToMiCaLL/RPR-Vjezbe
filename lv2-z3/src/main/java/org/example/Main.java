package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner unos=new Scanner(System.in);
        String Rijec = unos.nextLine();
        List<Integer> lista=new ArrayList<>();
        while(!Objects.equals(Rijec, "stop"))
        {
            try
            {
                int broj=Integer.parseInt(Rijec);
                lista.add(broj);
            }catch(NumberFormatException e)
            {
                System.out.println("Pogresan unos!");
            }
            Rijec=unos.nextLine();
        }
        int min=lista.get(0);
        int max=lista.get(0);
        double devijacija=0,prosjek=0;
        int n=lista.size();
        double mean=0;
        if(n%2==0) mean=(lista.get(n/2)+lista.get(n/2+1))/2;
        else mean=lista.get((n+1)/2);
        for(int i=0;i<n;i++)
        {
            if(lista.get(i)<min) min=lista.get(i);
            if(lista.get(i)>max) max=lista.get(i);
            prosjek=lista.get(i);
        }
        prosjek=prosjek/n;
        for(int x:lista)
        {
            devijacija+=(x-prosjek)*(x-prosjek);
        }
        devijacija=sqrt(devijacija/(n-1));
        System.out.println("Min element je: "+min+"\n"+"Max element je: "+max+"\n"+"Medijana je: "+mean+"\n"+"Standardna devijacija je: "+devijacija);

    }
}