module casus.opt3testcasus {
    requires javafx.controls;
    requires javafx.fxml;


    opens casus.opt3testcasus to javafx.fxml;
    exports casus.opt3testcasus;
}