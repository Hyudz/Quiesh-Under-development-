module com.example.Quiesh {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.Quiesh to javafx.fxml;
    exports com.example.Quiesh;
}
