package ba.unsa.etf.rpr;


public class Laptop {
 private String brend,model,procesor,grafickaKartica;
 private double cijena,velicinaEkrana;
 private int ram,hdd,ssd;
 String dajProcesor(){return procesor;};
 String dajBrend(){return brend;};
 String dajModel(){return model;};
 String dajGrafickuKarticu(){return grafickaKartica;};
 double dajCijenu(){return cijena;};
 double dajVelicinaEkrana(){return velicinaEkrana;};
 int dajRam(){return ram;};
 int dajHdd(){return hdd;};
 int dajSsd(){return ssd;};
 void staviProcesor(String proc){procesor=proc;};
 void staviBrend(String br){brend=br;};
 void staviModel(String mod){model=mod;};
 void staviGraficku(String graf){grafickaKartica=graf;}
 void staviCijenu(double cij){cijena=cij;};
 void staviVelicinuEkrana(double vel){velicinaEkrana=vel;};
 void staviRam(int R){ram=R;};
 void staviHdd(int H){hdd=H;};
 void staviSsd(int S){ssd=S;};
 @Override
 public String toString()
 {
  StringBuilder konacni=new StringBuilder();
  konacni.append("\nBrend: ").append(brend).append("\nModel: ").append(model).append("\nProcesor: ").append(procesor)
          .append("\nGraficka kartica: ").append(grafickaKartica).append("\nRam: ").append(ram).append("\nHDD: ")
          .append(hdd).append("\nSSD: ").append(ssd).append("\nVelicina ekrana: ").append(velicinaEkrana)
          .append("\nCijena: ").append(cijena).append("\n");
  return konacni.toString();
 }
}