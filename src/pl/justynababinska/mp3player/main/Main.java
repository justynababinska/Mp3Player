package pl.justynababinska.mp3player.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		final String appName = "Mp3Player v0.1";
		try {
			Parent parent = (Parent) FXMLLoader
					.load(getClass().getResource("/pl/justynababinska/mp3player/view/MainPane.fxml"));
			Scene scene = new Scene(parent);
			primaryStage.setTitle(appName);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}