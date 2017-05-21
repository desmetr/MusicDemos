package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application
{
	@Override
	public void start(Stage primaryStage) 
	{
		MusicDemosView musicDemosView = new MusicDemosView();
		new MusicDemosPresenter(musicDemosView);
		
		primaryStage.setScene(new Scene(musicDemosView, 1320, 600));
		musicDemosView.setVisible(true);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Music Generation Demos");
		primaryStage.show();
	
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>()
		{
			public void handle(WindowEvent we) 
			{
				if (AudioManager.isBeadsMusicPlaying)
					AudioManager.stopMusic();
				if (AudioManager.isBeadsSamplePlaying)
					AudioManager.stopSample();
			}
	    });   
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}
