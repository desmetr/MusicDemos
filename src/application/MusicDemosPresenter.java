package application;

import javafx.event.ActionEvent;

public class MusicDemosPresenter 
{
	private MusicDemosView musicDemosView;

	public MusicDemosPresenter(MusicDemosView musicDemosView) 
	{
		this.musicDemosView = musicDemosView;
		
		initialiseEventHandlers();
	}
	
	private void initialiseEventHandlers()
	{
		musicDemosView.getBeadsMusicDemoButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playMusic();
			}
		);
		
		musicDemosView.getBeadsSampleDemoButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playSample();
			}
		);
		
		musicDemosView.getWolframButton1().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playWolfram1();
			}
		);
		
		musicDemosView.getWolframButton2().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playWolfram2();
			}
		);
		
		musicDemosView.getWolframButton3().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playWolfram3();
			}
		);
		
		musicDemosView.getWolframButton3_1().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playWolfram3_1();
			}
		);
		
		musicDemosView.getWolframButton3_2().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playWolfram3_2();
			}
		);
		
		musicDemosView.getWolframButton3_3().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playWolfram3_3();
			}
		);
	}
}
