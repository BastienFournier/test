
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class test extends ApplicationNoModule {

    @Override
    public void start(Stage primaryStage) {

        Label label = new Label("Hello, World!");


        StackPane root = new StackPane();
        root.getChildren().add(label);


        Scene scene = new Scene(root, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
