module pl.kryptografia.aes {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires java.xml.bind;
    requires commons.math3;

    opens pl.kryptografia.aes to javafx.fxml;
    exports pl.kryptografia.aes;

    opens pl.kryptografia.elgamal to javafx.fxml;
    exports pl.kryptografia.elgamal;
}