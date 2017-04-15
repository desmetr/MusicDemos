package application;

import javafx.event.ActionEvent;

public class MusicDemosPresenter 
{
	private MusicDemosView musicDemosView;
	
	private boolean isBeadsMusicPlaying;
	private boolean isBeadsSamplePlaying;
	
	public MusicDemosPresenter(MusicDemosView musicDemosView) 
	{
		this.musicDemosView = musicDemosView;
		this.isBeadsMusicPlaying = false;
		this.isBeadsSamplePlaying = false;
		
		initialiseEventHandlers();
	}
	
	private void initialiseEventHandlers()
	{
		musicDemosView.getBeadsMusicDemoButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isBeadsMusicPlaying)
				{
					AudioManager.playMusic();
					isBeadsMusicPlaying = true;
					musicDemosView.getBeadsMusicDemoButton().setText("Stop");
				}
				else
				{
					AudioManager.stopMusic();
					isBeadsMusicPlaying = false;
					musicDemosView.getBeadsMusicDemoButton().setText("Music Demo");
				}
				
			}
		);
		
		musicDemosView.getBeadsSampleDemoButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isBeadsSamplePlaying)
				{
					AudioManager.playSample();
					isBeadsSamplePlaying = true;
					musicDemosView.getBeadsSampleDemoButton().setText("Stop");
				}
				else
				{
					AudioManager.stopSample();
					isBeadsSamplePlaying = false;
					musicDemosView.getBeadsSampleDemoButton().setText("Sample Demo");
				}
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
		
		musicDemosView.getMajorChordButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playMajorChord();
			}
		);
		
		musicDemosView.getMinorChordButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playMinorChord();
			}
		);
		
		musicDemosView.getDiminishedChordButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playDiminishedChord();
			}
		);
		
		musicDemosView.getSineWaveButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playSineWave();
			}
		);
		
		musicDemosView.getSawWaveButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playSawWave();
			}
		);
		
		musicDemosView.getSquareWaveButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playSquareWave();
			}
		);
		
		musicDemosView.getTriangleWaveButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playTriangleWave();
			}
		);
		
		musicDemosView.getBluesFormButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playBluesForm();
			}
		);
		
		musicDemosView.getI_II_V_I_Button().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.play1251();
			}
		);
		
		musicDemosView.getComp1Button().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playComp1();
			}
		);
		
		musicDemosView.getComp2Button().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playComp2();
			}
		);
		
		musicDemosView.getComp3Button().setOnAction
		(
			(ActionEvent event)
			->
			{
				AudioManager.playComp3();
			}
		);
	}
}
