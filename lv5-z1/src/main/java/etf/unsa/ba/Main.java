package etf.unsa.ba;


import java.util.Scanner;


public class Main {
    public static String imeIPrezime(LicneInformacije A) //Samo klasa za provjeru naslijedjivanja
    {
        return A.getIme()+' '+A.getPrezime();
    }
    public static void main(String[] args) {
        Student Test = new Student();
        Scanner unos = new Scanner(System.in);
        int n=0;
        String temp=new String();
        while(n==0) {

            System.out.print("Unesite ime studenta: ");
            temp = unos.next();
            Test.setIme(temp);
            System.out.print("Unesite prezime studenta: ");
            temp = unos.next();
            Test.setPrezime(temp);
            System.out.println("Student se zove "+imeIPrezime(Test));
            System.out.print("Ukoliko podaci nisu korektni i želite ponovni upis" +
                    " unesite 0 u suprotnom unesite bilo koji broj:");
            n=unos.nextInt();
        }
        System.out.print("Unesite godinu studija studenta: ");
        temp = unos.next();
        Test.setGodinaStudija(temp);
        System.out.print("Unesite broj indexa studenta: ");
        temp = unos.next();
        Test.setBrojIndexa(temp);
        System.out.println(Test.toString());
        System.out.println("PROVJERA NASTAVNIK");
        Nastavnik Test1=new Nastavnik();
        n=0;
        while(n==0) {

            System.out.print("Unesite ime nastavnika: ");
            temp = unos.next();
            Test1.setIme(temp);
            System.out.print("Unesite prezime nastavnika: ");
            temp = unos.next();
            Test1.setPrezime(temp);
            System.out.println("Nastavnik se zove "+imeIPrezime(Test1));
            System.out.print("Ukoliko podaci nisu korektni i želite ponovni upis" +
                    " unesite 0 u suprotnom unesite bilo koji broj:");
            n=unos.nextInt();
        }
        System.out.print("Unesite titulu nastavnika: ");
        temp = unos.next();
        Test1.setTitula(temp);
        System.out.println(Test1.toString());
    }
}