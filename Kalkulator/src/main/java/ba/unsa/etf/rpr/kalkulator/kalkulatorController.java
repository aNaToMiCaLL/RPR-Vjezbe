package ba.unsa.etf.rpr.kalkulator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import org.w3c.dom.events.MouseEvent;


public class kalkulatorController {
    @FXML
    private Label ekran;
    private String trenutni="";
    private String prethodni="";
    private char operacija=' ';

    public kalkulatorController()
    {
        ekran=new Label();
        ekran.setText("0");
    }
    private void dodajBroj(String br) {
        if (!trenutni.isEmpty() && !br.equals("0")) {
            trenutni += br;
            ekran.setText(trenutni);
        }
    }
    private void izvrsiOperacija(char operacija1) {
        if (operacija == ' ') {
            operacija = operacija1;
            prethodni = trenutni;
            trenutni="";
            ekran.setText("0");
        } else {
            if (operacija == '+') {
                trenutni = "" + (Double.parseDouble(trenutni) + Double.parseDouble(prethodni));
                prethodni=trenutni;
                ekran.setText(trenutni);
                trenutni="";
            }
            else if (operacija == '-') {
                trenutni = "" + (Double.parseDouble(trenutni) - Double.parseDouble(prethodni));
                prethodni=trenutni;
                ekran.setText(trenutni);
                trenutni="";
            }
            else if(operacija == '*') {
                trenutni = "" + (Double.parseDouble(trenutni) * Double.parseDouble(prethodni));
                prethodni=trenutni;
                ekran.setText(trenutni);
                trenutni="";
            }else if (operacija == '%') {
                trenutni = "" + (Double.parseDouble(trenutni) % Double.parseDouble(prethodni));
                prethodni=trenutni;
                ekran.setText(trenutni);
                trenutni="";
            }
        }
    }
    @FXML
    private void Nula(javafx.scene.input.MouseEvent mouseEvent)
    {
        dodajBroj("0");
    }
    @FXML
    private void Jedan(javafx.scene.input.MouseEvent mouseEvent)
    {
        dodajBroj("1");
    }
    @FXML
    private void Dva(javafx.scene.input.MouseEvent mouseEvent)
    {
        dodajBroj("2");
    }
    @FXML
    private void Tri(javafx.scene.input.MouseEvent mouseEvent)
    {
        dodajBroj("3");
    }
    @FXML
    private void Cetiri(javafx.scene.input.MouseEvent mouseEvent)
    {
        dodajBroj("4");
    }
    @FXML
    private void Pet(javafx.scene.input.MouseEvent mouseEvent)
    {
        dodajBroj("5");
    }
    @FXML
    private void Sest(javafx.scene.input.MouseEvent mouseEvent)
    {
        dodajBroj("6");
    }
    @FXML
    private void Sedam(javafx.scene.input.MouseEvent mouseEvent) {
        dodajBroj("7");
    }
    @FXML
    private void Osam(javafx.scene.input.MouseEvent mouseEvent)
    {
        dodajBroj("8");
    }
    @FXML
    private void Devet(javafx.scene.input.MouseEvent mouseEvent)
    {
        dodajBroj("9");
    }

    public void Mod(KeyEvent keyEvent) {
        izvrsiOperacija('%');
    }

    public void Djeljenje(KeyEvent keyEvent) {
        izvrsiOperacija('/');
    }

    public void Množenje(KeyEvent keyEvent) {
        izvrsiOperacija('*');
    }

    public void Oduzimanje(KeyEvent keyEvent) {
        izvrsiOperacija('-');
    }

    public void Sabiranje(KeyEvent keyEvent) {
        izvrsiOperacija('%');
    }

    public void Jednako(KeyEvent keyEvent) {
        izvrsiOperacija(operacija);
        operacija=' ';
    }
}