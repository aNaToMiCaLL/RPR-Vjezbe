package org.example;

import java.util.Scanner;

import static java.lang.Math.sin;

public class Main {

    public static int Faktorijel(int n) {
        int proizvod = 1;
        for (int i = 1; i <= n; i++) {
            proizvod = proizvod * i;
        }
        return proizvod;
    }
    public static void main(String[] args) {
        //Scanner unos=new Scanner(System.in);
        System.out.println(Faktorijel(Integer.valueOf(args[0])));
        System.out.println(sin(Integer.valueOf(args[1])));
    }
}