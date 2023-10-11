module csc.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    opens csc.colorchooser to javafx.fxml;
    exports csc.colorchooser;
}
