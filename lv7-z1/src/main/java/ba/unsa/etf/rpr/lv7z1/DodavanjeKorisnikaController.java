package ba.unsa.etf.rpr.lv7z1;

import javafx.application.Platform;
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
    private HashMap<String, ArrayList<String>> lista=new HashMap<>();
    private String ime=new String();
    private String prezime=new String();
    private String email=new String();
    private String username=new String();
    private String sifra=new String();
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
        if(lista.containsKey(username))
        {
            ArrayList<String> podaci=lista.get(username);
            if(c=='I')
            {
                podaci.set(0,ime);
            }
            else if(c=='P')
            {
                podaci.set(1,prezime);
            }
            else if(c=='E')
            {
                podaci.set(2,email);
            }
            else if(c=='S')
            {
                podaci.set(3,sifra);
            }
            lista.put(username,podaci);
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
        if(ime.isEmpty() || prezime.isEmpty() || email.isEmpty() || sifra.isEmpty() || username.isEmpty())
            greska.setText("UNESITE SVE PODATKE!");
        else
        {
            if(lista.containsKey(username))
            {
                greska.setText("Korisnik vec postoji");
            }
            else
            {
                ArrayList<String> podaci=new ArrayList<>();
                podaci.add(ime);
                podaci.add(prezime);
                podaci.add(email);
                podaci.add(sifra);
                lista.put(username,podaci);
                Set<String> imena=lista.keySet();
                ArrayList<String> svaImena=new ArrayList<>();
                for(String ime:imena)
                {
                    svaImena.add(ime);
                }
                Lista.setItems(FXCollections.observableList(svaImena));
            }
        }
    }
    @FXML
    public void dodajIme(KeyEvent keyEvent)
    {
        greska.setText("");
        ime=txt1.getText();
        izmjeniAkoPostji('I');
    }
    @FXML
    public void dodajPrezime(KeyEvent keyEvent)
    {
        greska.setText("");
        prezime=txt2.getText();
        izmjeniAkoPostji('P');
    }
    @FXML
    public void dodajEmail(KeyEvent keyEvent)
    {
        greska.setText("");
        email=txt3.getText();
        izmjeniAkoPostji('E');
    }
    @FXML
    public void dodajUsername(KeyEvent keyEvent)
    {
        greska.setText("");
        username=txt4.getText();
    }
    @FXML
    public void dodajSifru(KeyEvent keyEvent)
    {
        greska.setText("");
        sifra=txt5.getText();
        izmjeniAkoPostji('S');
    }
    @FXML

    public void odaberiKorisnika(MouseEvent mouseEvent) {
        greska.setText("");
        String temp=Lista.getSelectionModel().getSelectedItem();
        if(lista.containsKey(temp))
        {
            username=temp;
        ArrayList<String> podaci=lista.get(username);
        ime= podaci.get(0);
        prezime=podaci.get(1);
        email=podaci.get(2);
        sifra=podaci.get(3);
        txt1.setText(ime);
        txt2.setText(prezime);
        txt3.setText(email);
        txt4.setText(username);
        txt5.setText(sifra);
        }
    }
}