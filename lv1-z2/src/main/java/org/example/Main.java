package org.example;
import java.util.Scanner;

public class Main {
    public static int suma(int n)
    {
        int temp=n;
        int suma=0;
        while(temp>0)
        {
            suma=suma+temp%10;
            temp=temp/10;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesi broj: ");
        Scanner unos=new Scanner(System.in);
        int n= unos.nextInt();
        System.out.println("Brojevi djeljivi sa sumom cifara su: ");
        for (int i = 1; i <= n; i++) {
            if (i % suma(i) == 0) {
                if (i == 1) System.out.print(i);
                else System.out.printf(", " + i);
            }
        }
    }
}