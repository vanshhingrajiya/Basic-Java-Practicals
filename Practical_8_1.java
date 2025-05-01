import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Practical_8_1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox(10); // 10px spacing between texts

        for (int i = 0; i < 5; i++) {
            Text text = new Text("Java");
            text.setTranslateY(20);
            // Set font to Times Roman, bold, italic, size 22
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));

            // Set random color and opacity
            text.setFill(Color.color(Math.random(), Math.random(), Math.random(), Math.random()));

            // Rotate the text vertically
            text.setRotate(90);

            hBox.getChildren().add(text);
        }

        Scene scene = new Scene(hBox, 300, 100);
        primaryStage.setTitle("Practical_8_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
