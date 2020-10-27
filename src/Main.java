import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main (String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("superAwesomeChartView.fxml"));

        // Create a scene
        Scene scene = new Scene(root);

        // Set and show the scene
        stage.setScene(scene);
        stage.setTitle("Sleepless Night Chart");
        stage.show();
    }
}
