package org.example;

import java.util.*;

public class Imenik {
    private Map<String,TelefonskiBroj> brojevi;
    Imenik(){
        brojevi=new HashMap<String,TelefonskiBroj>();
    }
    void Dodaj(String ime,TelefonskiBroj broj)
    {
        brojevi.put(ime,broj);
    };
    String dajBroj(String ime){
        TelefonskiBroj broj=brojevi.get(ime);
        return broj.ispisi();}
    String dajIme(TelefonskiBroj broj){return "";}
    String naSlovo(char s){
        StringBuilder builder = new StringBuilder();
        int br=1;
        for(Map.Entry<String,TelefonskiBroj> entry : this.brojevi.entrySet()){
            if(entry.getKey().startsWith(String.valueOf(s))){
                builder.append(br);
                builder.append(". ");
                builder.append(entry.getKey())
                        .append(" - ")
                        .append(entry.getValue().ispisi())
                        .append('\n');
            }
            br++;
        }
        return builder.toString();

    }
    private boolean jelIzGrada(TelefonskiBroj broj,Grad g) {
        if (broj instanceof FiksniBroj)
            return g.equals(((FiksniBroj) broj).getGrad());
        return false;
    }
    Set<String> izGrada(Grad g){
        Set<String> results = new TreeSet<String>();
        for(Map.Entry<String,TelefonskiBroj> entry : this.brojevi.entrySet()){
            if(jelIzGrada(entry.getValue(),g))
                results.add(entry.getKey());
        }
        return results;

        };
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> results = new TreeSet<TelefonskiBroj>(new Comparator<TelefonskiBroj>(){
            @Override
            public int compare(TelefonskiBroj b1, TelefonskiBroj b2){return b1.ispisi().compareTo(b2.ispisi());}
        });
        for (Map.Entry<String,TelefonskiBroj> entry : this.brojevi.entrySet()){
            if(jelIzGrada(entry.getValue(),g))
                results.add(entry.getValue());
        }
        return results;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int br=1;
        for(Map.Entry<String,TelefonskiBroj> entry : this.brojevi.entrySet()){
            builder.append(br)
                    .append(". ")
                    .append(entry.getKey())
                    .append(" - ")
                    .append(entry.getValue().ispisi())
                    .append('\n');
            br++;
        }
        return builder.toString();
    }

    public void dodaj(String ime, TelefonskiBroj br) {
        brojevi.put(ime,br);
    }
}
