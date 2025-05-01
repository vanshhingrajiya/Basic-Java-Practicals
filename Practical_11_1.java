import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.LinkedList;

public class HelloApplication extends Application {

    private LinkedList<Integer> numberList = new LinkedList<>();
    private TextArea textArea = new TextArea();
    private TextField inputField = new TextField();

    @Override
    public void start(Stage primaryStage) {
        // Top: Input field
        HBox topPane = new HBox(10);
        topPane.getChildren().addAll(new Label("Enter a number:"), inputField);

        // Center: Text area
        textArea.setEditable(false);

        // Bottom: Buttons
        Button sortBtn = new Button("Sort");
        Button shuffleBtn = new Button("Shuffle");
        Button reverseBtn = new Button("Reverse");

        HBox buttonPane = new HBox(10);
        buttonPane.getChildren().addAll(sortBtn, shuffleBtn, reverseBtn);

        // Main layout
        BorderPane mainPane = new BorderPane();
        mainPane.setTop(topPane);
        mainPane.setCenter(textArea);
        mainPane.setBottom(buttonPane);

        // Event handling
        inputField.setOnAction(e -> addNumber());
        sortBtn.setOnAction(e -> {
            Collections.sort(numberList);
            updateTextArea();
        });
        shuffleBtn.setOnAction(e -> {
            Collections.shuffle(numberList);
            updateTextArea();
        });
        reverseBtn.setOnAction(e -> {
            Collections.reverse(numberList);
            updateTextArea();
        });

        // Stage setup
        Scene scene = new Scene(mainPane, 400, 250);
        primaryStage.setTitle("Practical_11_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addNumber() {
        try {
            int number = Integer.parseInt(inputField.getText().trim());
            if (!numberList.contains(number)) {
                numberList.add(number);
                updateTextArea();
            }
            inputField.clear();
        } catch (NumberFormatException ex) {
            inputField.clear();
            inputField.setPromptText("Invalid input!");
        }
    }

    private void updateTextArea() {
        textArea.setText(numberList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
