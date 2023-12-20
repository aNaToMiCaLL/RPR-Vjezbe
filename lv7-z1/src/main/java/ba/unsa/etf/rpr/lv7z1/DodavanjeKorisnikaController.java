package ba.unsa.etf.rpr.lv7z1;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class DodavanjeKorisnikaController {
    @FXML
    public TextField txt1;
    @FXML
    public TextField txt2;
    @FXML
    public TextField txt3;
    @FXML
    public TextField txt4;
    @FXML
    public PasswordField txt5;
    @FXML
    public ListView<String> Lista;
    @FXML
    public Label greska;
    Korisnik trenutni=new Korisnik();
    private HashMap<String, ArrayList<String>> lista=new HashMap<>();
    /*nbprivate String ime=new String();
    private String prezime=new String();
    private String email=new String();
    private String username=new String();
    private String sifra=new String();*/
    public DodavanjeKorisnikaController()
    {

        txt1=new TextField();
        txt2=new TextField();
        txt3=new TextField();
        txt4=new TextField();
        txt5=new PasswordField();
        Lista=new ListView<>();
        greska=new Label();
    }
    private void izmjeniAkoPostji(char c)
    {
        if(lista.containsKey(trenutni.getUsername().get()))
        {
            ArrayList<String> podaci=lista.get(trenutni.getUsername().get());
            if(c=='I')
            {
                podaci.set(0, trenutni.getIme().get());
            }
            else if(c=='P')
            {
                podaci.set(1, trenutni.getPrezime().get());
            }
            else if(c=='E')
            {
                podaci.set(2, trenutni.getEmail().get());
            }
            else if(c=='S')
            {
                podaci.set(3, trenutni.getSifra().get());
            }
            lista.put(trenutni.getUsername().get(),podaci);
        }
    }
    @FXML
    public void zavrsi(MouseEvent mouseEvent)
    {
        Platform.exit();
    }
    @FXML
    public void dodajKorisnika(MouseEvent mouseEvent)
    {
        if(txt1.getText().isEmpty() || txt2.getText().isEmpty()
                || txt3.getText().isEmpty() || txt4.getText().isEmpty() ||
                txt5.getText().isEmpty())
            greska.setText("UNESITE SVE PODATKE!");
        else
        {
            if(lista.containsKey(trenutni.getUsername().get()))
            {
                greska.setText("Korisnik vec postoji");
            }
            else
            {
                ArrayList<String> podaci=new ArrayList<>();
                podaci.add(trenutni.getIme().get());
                podaci.add(trenutni.getPrezime().get());
                podaci.add(trenutni.getEmail().get());
                podaci.add(trenutni.getSifra().get());
                lista.put(trenutni.getUsername().get(),podaci);
                Set<String> imena=lista.keySet();
                ArrayList<String> svaImena=new ArrayList<>();
                for(String ime:imena)
                {
                    svaImena.add(ime);
                }
                Lista.setItems(FXCollections.observableList(svaImena));
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
            }
        }
    }
    @FXML
    public void dodajIme(KeyEvent keyEvent)
    {
        greska.setText("");
        trenutni.setIme(txt1.getText());
        izmjeniAkoPostji('I');
    }
    @FXML
    public void dodajPrezime(KeyEvent keyEvent)
    {
        greska.setText("");
        trenutni.setPrezime(txt2.getText());
        izmjeniAkoPostji('P');
    }
    @FXML
    public void dodajEmail(KeyEvent keyEvent)
    {
        greska.setText("");
        trenutni.setEmail(txt3.getText());
        izmjeniAkoPostji('E');
    }
    @FXML
    public void dodajUsername(KeyEvent keyEvent)
    {
        greska.setText("");
        trenutni.setUsername(txt4.getText());
    }
    @FXML
    public void dodajSifru(KeyEvent keyEvent)
    {
        greska.setText("");
        trenutni.setSifra(txt5.getText());
        izmjeniAkoPostji('S');
    }
    @FXML

    public void odaberiKorisnika(MouseEvent mouseEvent) {
        greska.setText("");
        String temp=Lista.getSelectionModel().getSelectedItem();
        if(lista.containsKey(temp))
        {
            trenutni.setUsername(temp);
        ArrayList<String> podaci=lista.get(trenutni.getUsername().get());
        trenutni.setIme(podaci.get(0));
        trenutni.setPrezime(podaci.get(1));
        trenutni.setEmail(podaci.get(2));
        trenutni.setSifra(podaci.get(3));
        txt1.setText(trenutni.getIme().get());
        txt2.setText(trenutni.getPrezime().get());
        txt3.setText(trenutni.getEmail().get());
        txt4.setText(trenutni.getUsername().get());
        txt5.setText(trenutni.getSifra().get());
        }
    }
}