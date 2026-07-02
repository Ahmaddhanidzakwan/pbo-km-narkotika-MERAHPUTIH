module com.example.pbokmnarkotikamerahputih {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports com.example.pbokmnarkotikamerahputih.app;
    exports com.example.pbokmnarkotikamerahputih.view;
    exports com.example.pbokmnarkotikamerahputih.controller;
    exports com.example.pbokmnarkotikamerahputih.model;
    exports com.example.pbokmnarkotikamerahputih.util;

    opens com.example.pbokmnarkotikamerahputih.view to javafx.graphics, javafx.fxml;
    opens com.example.pbokmnarkotikamerahputih to javafx.graphics;
}
