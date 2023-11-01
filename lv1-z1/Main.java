package org.example;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Unesi prvi broj: ");
		Scanner ulaz=new Scanner(System.in);
		int a=ulaz.nextInt();
		System.out.println("Unesi drui broj: ");
		int b=ulaz.nextInt();
		System.out.println("Prvi broj je "+a+", drugi broj je "+b);		
	}

}