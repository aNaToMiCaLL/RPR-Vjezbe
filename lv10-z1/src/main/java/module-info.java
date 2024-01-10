module ba.unsa.etf.rpr.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ba.unsa.etf.rpr.demo1 to javafx.fxml;
    exports ba.unsa.etf.rpr.demo1;
}