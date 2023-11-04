package org.example;


import java.util.List;

public class Main {
    public class Osoba{
        private String ime,prezime;
        void Osoba(String ime, String prezime){};
        @Override
        public String toString(){return "a";};
    }
    public class Uposlenik extends Osoba
    {
        Uposlenik(String ime ,String prezime){};
    }
    public class Korisnik extends Osoba
    {
        Racun racun;
        Korisnik(String ime,String prezime){};
        void dodajRacun(Racun racun){};
    }
    public class Racun
    {
        Long brojRacuna;
        Osoba korisnikRacuna;
        boolean odobrenjePrekoracenja;
        Double stanjeRacuna;
        Racun(long numb,Osoba os){};
        private boolean provjerOdobrenjePrekoracenja(double numb){return true;};
        boolean izvrsiUplatu(double kolicina){return true;}
        boolean izvrsiIsplatu(double kolicina){return true;}
    }
    public class Banka
    {
        private Long brojRacuna;
        List<Korisnik> korisnici;
        List<Uposlenik> uposlenici;
        Banka(){}
        Korisnik kreirajNovogKorisnika(String ime,String prezime){
            Korisnik a=new Korisnik(ime,prezime);
            return a; }
        Uposlenik kreirajNovogUposlenika(String ime,String prezime){
            Uposlenik a=new Uposlenik(ime,prezime);
            return a; }
        Racun kreirajRacunZaKorisnika(Korisnik kor )
        {
            Racun a=new Racun(0,kor);
            return a;
        }
    }
    public static void main(String[] args) {
        }
    }