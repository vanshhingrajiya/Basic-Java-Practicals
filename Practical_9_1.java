import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    Text text = new Text("Programming is fun");
    ComboBox<String> cbFontFamilies = new ComboBox<>();
    ComboBox<Integer> cbFontSize = new ComboBox<>();
    CheckBox chkBold = new CheckBox("Bold");
    CheckBox chkItalic = new CheckBox("Italic");

    @Override
    public void start(Stage primaryStage) {
        // Font families
        cbFontFamilies.getItems().addAll(Font.getFamilies());
        cbFontFamilies.setValue(text.getFont().getFamily());
        cbFontFamilies.setOnAction(e -> update());

        Label lblFontFamilies = new Label("Font Name", cbFontFamilies);
        lblFontFamilies.setContentDisplay(ContentDisplay.RIGHT);

        // Font sizes
        cbFontSize.getItems().addAll(getSizes());
        cbFontSize.setValue((int) text.getFont().getSize());
        cbFontSize.setOnAction(e -> {
            update();
            primaryStage.sizeToScene();
        });

        Label lblFontSizes = new Label("Size", cbFontSize);
        lblFontSizes.setContentDisplay(ContentDisplay.RIGHT);

        // Top layout
        HBox topPane = new HBox(lblFontFamilies, lblFontSizes);
        topPane.setSpacing(5);
        topPane.setPadding(new Insets(5));

        // Checkboxes
        chkBold.setOnAction(e -> update());
        chkItalic.setOnAction(e -> update());

        HBox bottomPane = new HBox(chkBold, chkItalic);
        bottomPane.setAlignment(Pos.CENTER);
        bottomPane.setSpacing(10);
        bottomPane.setPadding(new Insets(10));

        // Center layout
        StackPane centerPane = new StackPane(text);

        // Main layout
        BorderPane borderPane = new BorderPane(centerPane);
        borderPane.setTop(topPane);
        borderPane.setBottom(bottomPane);

        primaryStage.setTitle("Practical 8B(1)");
        primaryStage.setScene(new Scene(borderPane, 400, 300));
        primaryStage.show();
    }

    private void update() {
        FontWeight fontWeight = chkBold.isSelected() ? FontWeight.BOLD : FontWeight.NORMAL;
        FontPosture fontPosture = chkItalic.isSelected() ? FontPosture.ITALIC : FontPosture.REGULAR;
        String fontFamily = cbFontFamilies.getValue();
        double size = cbFontSize.getValue();
        text.setFont(Font.font(fontFamily, fontWeight, fontPosture, size));
    }

    private Integer[] getSizes() {
        Integer[] sizes = new Integer[100];
        for (int i = 0; i < 100; i++) {
            sizes[i] = i + 1;
        }
        return sizes;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
