import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaPractice extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Hello, world!");
        label.setAlignment(Pos.CENTER);
        primaryStage.setScene(new Scene(label, 300, 250));
        primaryStage.setTitle("Hello World");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}