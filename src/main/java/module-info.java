module sample.game {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
<<<<<<< HEAD
=======
    requires java.desktop;
>>>>>>> 880d580 (feat (design): heart)

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens sample.game to javafx.fxml;
    exports sample.game;
<<<<<<< HEAD
}
=======
}

>>>>>>> 880d580 (feat (design): heart)
