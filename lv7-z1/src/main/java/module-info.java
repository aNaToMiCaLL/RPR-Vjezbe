module ba.unsa.etf.rpr.lv7z1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens ba.unsa.etf.rpr.lv7z1 to javafx.fxml;
    exports ba.unsa.etf.rpr.lv7z1;
}