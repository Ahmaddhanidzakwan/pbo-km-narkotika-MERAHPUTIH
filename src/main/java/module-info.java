module com.example.pbokmnarkotikamerahputih {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pbokmnarkotikamerahputih to javafx.fxml;
    exports com.example.pbokmnarkotikamerahputih;
    exports com;
    opens com to javafx.fxml;
}