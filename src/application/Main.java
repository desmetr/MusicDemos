package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
	@Override
	public void start(Stage primaryStage) 
	{
		MusicDemosView musicDemosView = new MusicDemosView();
		new MusicDemosPresenter(musicDemosView);
		
		primaryStage.setScene(new Scene(musicDemosView, 800, 600));
		primaryStage.setResizable(false);
		primaryStage.setTitle("Music Generation Demos");
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
