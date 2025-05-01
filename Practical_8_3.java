    import javafx.application.Application;
    import javafx.scene.Scene;
    import javafx.scene.layout.Pane;
    import javafx.scene.paint.Color;
    import javafx.scene.shape.Line;
    import javafx.scene.shape.Rectangle;
    import javafx.scene.shape.Shape;
    import javafx.stage.Stage;
    import java.util.ArrayList;
    import java.util.List;

    public class HelloApplication extends Application {
        public void start(Stage primaryStage) {
            Pane pane = new Pane();
            List<Shape> shapes = new ArrayList<>();

            Rectangle rec1 = new Rectangle();
            rec1.setFill(Color.TRANSPARENT);
            rec1.setStroke(Color.BLACK);
            rec1.xProperty().bind(pane.widthProperty().divide(4).subtract(25));
            rec1.yProperty().bind(pane.heightProperty().divide(4).add(25));
            rec1.widthProperty().bind(pane.widthProperty().divide(2));
            rec1.heightProperty().bind(pane.widthProperty().divide(2));
            shapes.add(rec1);

            Rectangle rec2 = new Rectangle();
            rec2.setFill(Color.TRANSPARENT);
            rec2.setStroke(Color.BLACK);
            rec2.xProperty().bind(pane.widthProperty().divide(4).add(25));
            rec2.yProperty().bind(pane.heightProperty().divide(4).subtract(25));
            rec2.widthProperty().bind(pane.widthProperty().divide(2));
            rec2.heightProperty().bind(pane.widthProperty().divide(2));
            shapes.add(rec2);

            Line line1 = new Line();
            line1.startXProperty().bind(rec1.xProperty());
            line1.startYProperty().bind(rec1.yProperty());
            line1.endXProperty().bind(rec2.xProperty());
            line1.endYProperty().bind(rec2.yProperty());
            shapes.add(line1);

            Line line2 = new Line();
            line2.startXProperty().bind(rec1.xProperty());
            line2.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty()));
            line2.endXProperty().bind(rec2.xProperty());
            line2.endYProperty().bind(rec2.yProperty().add(rec2.heightProperty()));
            shapes.add(line2);

            Line line3 = new Line();
            line3.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty()));
            line3.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty()));
            line3.endXProperty().bind(rec2.xProperty().add(rec2.widthProperty()));
            line3.endYProperty().bind(rec2.yProperty().add(rec2.heightProperty()));
            shapes.add(line3);

            Line line4 = new Line();
            line4.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty()));
            line4.startYProperty().bind(rec1.yProperty());
            line4.endXProperty().bind(rec2.xProperty().add(rec2.widthProperty()));
            line4.endYProperty().bind(rec2.yProperty());
            shapes.add(line4);

            pane.getChildren().addAll(shapes);

            Scene scene = new Scene(pane, 400, 400);
            primaryStage.setTitle("Practical 8A(3)");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
