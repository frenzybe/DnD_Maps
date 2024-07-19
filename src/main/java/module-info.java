module org.frenzybe.dnd_maps {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.frenzybe.dnd_maps.controllers to javafx.fxml;
    exports org.frenzybe.dnd_maps;
}