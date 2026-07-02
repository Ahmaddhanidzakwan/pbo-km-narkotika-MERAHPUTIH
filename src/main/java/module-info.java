module pbo.km.narkotika.MERAHPUTIH {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.pbokmnarkotikamerahputih.view;
    opens com.example.pbokmnarkotikamerahputih.view to javafx.graphics, javafx.fxml;


    exports com.example.pbokmnarkotikamerahputih.app;
    opens com.example.pbokmnarkotikamerahputih.app to javafx.fxml;

    exports com.example.pbokmnarkotikamerahputih.controller;
    opens com.example.pbokmnarkotikamerahputih.controller to javafx.fxml;
}
