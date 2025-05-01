import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 100);
        
        Text text = new Text(0, 50, "Programming is fun");
        pane.getChildren().add(text);

        // Animation using Timeline
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(20), e -> {
            // Move text to the right
            text.setX(text.getX() + 1);

            // Reset position if it goes out of view
            if (text.getX() > scene.getWidth()) {
                text.setX(-text.getLayoutBounds().getWidth());
            }
        }));

        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        // Pause when mouse is pressed
        scene.setOnMousePressed(e -> animation.pause());

        // Resume when mouse is released
        scene.setOnMouseReleased(e -> animation.play());

        primaryStage.setTitle("Exercise15_27");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
