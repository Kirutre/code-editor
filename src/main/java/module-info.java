module io.github.kirutre.code_editor {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens io.github.kirutre.code_editor to javafx.fxml;
    exports io.github.kirutre.code_editor;
    opens io.github.kirutre.code_editor.view to javafx.fxml;
}
