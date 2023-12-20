package ba.unsa.etf.rpr.lv7z1;

import java.util.ArrayList;
import java.util.HashMap;
import javafx.beans.property.SimpleStringProperty;

public class Korisnik {
    private SimpleStringProperty ime=new SimpleStringProperty();
    private SimpleStringProperty prezime=new SimpleStringProperty();
    private SimpleStringProperty email=new SimpleStringProperty();
    private SimpleStringProperty username=new SimpleStringProperty();
    private SimpleStringProperty sifra=new SimpleStringProperty();


    public SimpleStringProperty getIme() {
        return ime;
    }

    public SimpleStringProperty imeProperty() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime.set(ime);
    }

    public SimpleStringProperty getPrezime() {
        return prezime;
    }

    public SimpleStringProperty prezimeProperty() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }

    public SimpleStringProperty getEmail() {
        return email;
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public SimpleStringProperty getUsername() {
        return username;
    }

    public SimpleStringProperty usernameProperty() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public SimpleStringProperty getSifra() {
        return sifra;
    }

    public SimpleStringProperty sifraProperty() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra.set(sifra);
    }


}
