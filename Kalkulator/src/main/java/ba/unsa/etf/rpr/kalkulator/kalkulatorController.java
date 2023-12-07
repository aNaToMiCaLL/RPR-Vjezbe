package ba.unsa.etf.rpr.kalkulator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


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
    private void Nula(MouseEvent mouseEvent)
    {
        dodajBroj("0");
    }
    @FXML
    private void Jedan(MouseEvent mouseEvent)
    {
        dodajBroj("1");
    }
    @FXML
    private void Dva(MouseEvent mouseEvent)
    {
        dodajBroj("2");
    }
    @FXML
    private void Tri(MouseEvent mouseEvent)
    {
        dodajBroj("3");
    }
    @FXML
    private void Cetiri(MouseEvent mouseEvent)
    {
        dodajBroj("4");
    }
    @FXML
    private void Pet(MouseEvent mouseEvent)
    {
        dodajBroj("5");
    }
    @FXML
    private void Sest(MouseEvent mouseEvent)
    {
        dodajBroj("6");
    }
    @FXML
    private void Sedam(MouseEvent mouseEvent) {
        dodajBroj("7");
    }
    @FXML
    private void Osam(MouseEvent mouseEvent)
    {
        dodajBroj("8");
    }
    @FXML
    private void Devet(MouseEvent mouseEvent)
    {
        dodajBroj("9");
    }

    public void Mod(MouseEvent keyEvent) {
        izvrsiOperacija('%');
    }

    public void Djeljenje(MouseEvent keyEvent) {
        izvrsiOperacija('/');
    }

    public void Množenje(MouseEvent keyEvent) {
        izvrsiOperacija('*');
    }

    public void Oduzimanje(MouseEvent keyEvent) {
        izvrsiOperacija('-');
    }

    public void Sabiranje(MouseEvent keyEvent) {
        izvrsiOperacija('%');
    }

    public void Jednako(MouseEvent keyEvent) {
        izvrsiOperacija(operacija);
        operacija=' ';
    }
}