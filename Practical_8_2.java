import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public void start(Stage primaryStage) {
        HBox hBox = new HBox(15);
        String[] type = {"Project", "Quiz", "Midterm", "Final"};
        double[] grade = {20, 10, 30, 40};

        double max = getMax(grade);
        double height = 200;
        double width = 50;

        StackPane pane = new StackPane();
        pane.setPadding(new Insets(20, 15, 5, 15));

        Rectangle r1 = new Rectangle(width, height * grade[0] / max);
        r1.setFill(Color.RED);
        Rectangle r2 = new Rectangle(width, height * grade[1] / max);
        r2.setFill(Color.BLUE);
        Rectangle r3 = new Rectangle(width, height * grade[2] / max);
        r3.setFill(Color.GREEN);
        Rectangle r4 = new Rectangle(width, height * grade[3] / max);
        r4.setFill(Color.ORANGE);

        Text t1 = new Text(type[0] + " " + grade[0] + "%");
        Text t2 = new Text(type[1] + " " + grade[1] + "%");
        Text t3 = new Text(type[2] + " " + grade[2] + "%");
        Text t4 = new Text(type[3] + " " + grade[3] + "%");

        hBox.getChildren().addAll(getVBox(t1, r1), getVBox(t2, r2), getVBox(t3, r3), getVBox(t4, r4));
        pane.getChildren().add(hBox);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Practical 8A (2)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public double getMax(double[] l) {
        double max = l[0];
        for (double v : l) {
            if (v > max)
                max = v;
        }
        return max;
    }

    public VBox getVBox(Text t, Rectangle r) {
        VBox vBox = new VBox(5);
        vBox.setAlignment(Pos.BOTTOM_LEFT);
        vBox.getChildren().addAll(t, r);
        return vBox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
