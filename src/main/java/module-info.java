module io.github.kirutre.code_editor {
    requires javafx.controls;
    requires javafx.fxml;

    opens io.github.kirutre.code_editor to javafx.fxml;
    exports io.github.kirutre.code_editor;
}
