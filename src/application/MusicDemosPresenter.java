package application;

import javafx.event.ActionEvent;

public class MusicDemosPresenter 
{
	private MusicDemosView musicDemosView;
	
	private boolean isBeadsMusicPlaying;
	private boolean isBeadsSamplePlaying;
	
	public static boolean isWolfram1Playing;
	private boolean isWolfram2Playing;
	private boolean isWolfram3Playing;
	private boolean isWolfram3_1Playing;
	private boolean isWolfram3_2Playing;
	private boolean isWolfram3_3Playing;
	
	private boolean isMajorChordPlaying;
	private boolean isMinorChordPlaying;
	private boolean isDiminishedChordPlaying;
	
	private boolean isSineWavePlaying;
	private boolean isSquareWavePlaying;
	private boolean isSawWavePlaying;
	private boolean isTriangleWavePlaying;
	
	private boolean isBluesFormPlaying;
	private boolean is1251Playing;
	
	private boolean isComp1Playing;
	private boolean isComp2Playing;
	private boolean isComp3Playing;
	
	private boolean isGA1Playing;
	private boolean isGA2Playing;
	private boolean isGA3Playing;
	
	public MusicDemosPresenter(MusicDemosView musicDemosView) 
	{
		this.musicDemosView = musicDemosView;
		this.isBeadsMusicPlaying = false;
		this.isBeadsSamplePlaying = false;
		
		this.isWolfram1Playing = false;
		this.isWolfram2Playing = false;
		this.isWolfram3Playing = false;
		this.isWolfram3_1Playing = false;
		this.isWolfram3_2Playing = false;
		this.isWolfram3_3Playing = false;
		
		this.isMajorChordPlaying = false;
		this.isMinorChordPlaying = false;
		this.isDiminishedChordPlaying = false;
		
		this.isSineWavePlaying = false;
		this.isSquareWavePlaying = false;
		this.isSawWavePlaying = false;
		this.isTriangleWavePlaying = false;
		
		this.isBluesFormPlaying = false;
		this.is1251Playing = false;
		
		this.isComp1Playing = false;
		this.isComp2Playing = false;
		this.isComp3Playing = false;
		
		this.isGA1Playing = false;
		this.isGA2Playing = false;
		this.isGA3Playing = false;
		
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
				if (! isWolfram1Playing)
				{
					AudioManager.playWolfram1();
					isWolfram1Playing = true;
					musicDemosView.getWolframButton1().setText("Stop");
				}
				else
				{
					AudioManager.stopWolfram1();
					isWolfram1Playing = false;
					musicDemosView.getWolframButton1().setText("Wolfram 1");
				}
				
			}
		);
		
		musicDemosView.getWolframButton2().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isWolfram2Playing)
				{
					AudioManager.playWolfram2();
					isWolfram2Playing = true;
					musicDemosView.getWolframButton2().setText("Stop");
				}
				else
				{
					AudioManager.stopWolfram2();
					isWolfram2Playing = false;
					musicDemosView.getWolframButton2().setText("Wolfram 2");
				}
			}
		);
		
		musicDemosView.getWolframButton3().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isWolfram3Playing)
				{
					AudioManager.playWolfram3();
					isWolfram3Playing = true;
					musicDemosView.getWolframButton3().setText("Stop");
				}
				else
				{
					AudioManager.stopWolfram3();
					isWolfram3Playing = false;
					musicDemosView.getWolframButton3().setText("Wolfram 3");
				}
			}
		);
		
		musicDemosView.getWolframButton3_1().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isWolfram3_1Playing)
				{
					AudioManager.playWolfram3_1();
					isWolfram3_1Playing = true;
					musicDemosView.getWolframButton3_1().setText("Stop");
				}
				else
				{
					AudioManager.stopWolfram3_1();
					isWolfram3_1Playing = false;
					musicDemosView.getWolframButton3_1().setText("Other Scale");
				}
			}
		);
		
		musicDemosView.getWolframButton3_2().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isWolfram3_2Playing)
				{
					AudioManager.playWolfram3_2();
					isWolfram3_2Playing = true;
					musicDemosView.getWolframButton3_2().setText("Stop");
				}
				else
				{
					AudioManager.stopWolfram3_2();
					isWolfram3_2Playing = false;
					musicDemosView.getWolframButton3_2().setText("More NPB");
				}
			}
		);
		
		musicDemosView.getWolframButton3_3().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isWolfram3_3Playing)
				{
					AudioManager.playWolfram3_3();
					isWolfram3_3Playing = true;
					musicDemosView.getWolframButton3_3().setText("Stop");
				}
				else
				{
					AudioManager.stopWolfram3_3();
					isWolfram3_3Playing = false;
					musicDemosView.getWolframButton3_3().setText("Random Seed");
				}
			}
		);
		
		musicDemosView.getMajorChordButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isMajorChordPlaying)
				{
					AudioManager.playMajorChord();
					isMajorChordPlaying = true;
					musicDemosView.getMajorChordButton().setText("Stop");
				}
				else
				{
					AudioManager.stopMajorChord();
					isMajorChordPlaying = false;
					musicDemosView.getMajorChordButton().setText("Major Chord");
				}
			}
		);
		
		musicDemosView.getMinorChordButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isMinorChordPlaying)
				{
					AudioManager.playMinorChord();
					isMinorChordPlaying = true;
					musicDemosView.getMinorChordButton().setText("Stop");
				}
				else
				{
					AudioManager.stopMinorChord();
					isMinorChordPlaying = false;
					musicDemosView.getMinorChordButton().setText("Minor Chord");
				}
			}
		);
		
		musicDemosView.getDiminishedChordButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isDiminishedChordPlaying)
				{
					AudioManager.playDiminishedChord();
					isDiminishedChordPlaying = true;
					musicDemosView.getDiminishedChordButton().setText("Stop");
				}
				else
				{
					AudioManager.stopDiminishedChord();
					isDiminishedChordPlaying = false;
					musicDemosView.getDiminishedChordButton().setText("Diminished Chord");
				}
			}
		);
		
		musicDemosView.getSineWaveButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isSineWavePlaying)
				{
					AudioManager.playSineWave();
					isSineWavePlaying = true;
					musicDemosView.getSineWaveButton().setText("Stop");
				}
				else
				{
					AudioManager.stopSineWave();
					isSineWavePlaying = false;
					musicDemosView.getSineWaveButton().setText("Sine Wave");
				}
			}
		);
		
		musicDemosView.getSawWaveButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isSawWavePlaying)
				{
					AudioManager.playSawWave();
					isSawWavePlaying = true;
					musicDemosView.getSawWaveButton().setText("Stop");
				}
				else
				{
					AudioManager.stopSawWave();
					isSawWavePlaying = false;
					musicDemosView.getSawWaveButton().setText("Saw Wave");
				}
			}
		);
		
		musicDemosView.getSquareWaveButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isSquareWavePlaying)
				{
					AudioManager.playSquareWave();
					isSquareWavePlaying = true;
					musicDemosView.getSquareWaveButton().setText("Stop");
				}
				else
				{
					AudioManager.stopSquareWave();
					isSquareWavePlaying = false;
					musicDemosView.getSquareWaveButton().setText("Square Wave");
				}
			}
		);
		
		musicDemosView.getTriangleWaveButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isTriangleWavePlaying)
				{
					AudioManager.playTriangleWave();
					isTriangleWavePlaying = true;
					musicDemosView.getTriangleWaveButton().setText("Stop");
				}
				else
				{
					AudioManager.stopTriangleWave();
					isTriangleWavePlaying = false;
					musicDemosView.getTriangleWaveButton().setText("Triangle Wave");
				}
			}
		);
		
		musicDemosView.getBluesFormButton().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isBluesFormPlaying)
				{
					AudioManager.playBluesForm();
					isBluesFormPlaying = true;
					musicDemosView.getBluesFormButton().setText("Stop");
				}
				else
				{
					AudioManager.stopBluesForm();
					isBluesFormPlaying = false;
					musicDemosView.getBluesFormButton().setText("Blues Form");
				}
			}
		);
		
		musicDemosView.getI_II_V_I_Button().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! is1251Playing)
				{
					AudioManager.play1251();
					is1251Playing = true;
					musicDemosView.getI_II_V_I_Button().setText("Stop");
				}
				else
				{
					AudioManager.stop1251();
					is1251Playing = false;
					musicDemosView.getI_II_V_I_Button().setText("I-II-V-I");
				}
			}
		);
		
		musicDemosView.getCompButton1().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isComp1Playing)
				{
					AudioManager.playComp1();
					isComp1Playing = true;
					musicDemosView.getCompButton1().setText("Stop");
				}
				else
				{
					AudioManager.stopComp1();
					isComp1Playing = false;
					musicDemosView.getCompButton1().setText("Computoser 1");
				}
			}
		);
		
		musicDemosView.getCompButton2().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isComp2Playing)
				{
					AudioManager.playComp2();
					isComp2Playing = true;
					musicDemosView.getCompButton2().setText("Stop");
				}
				else
				{
					AudioManager.stopComp2();
					isComp2Playing = false;
					musicDemosView.getCompButton2().setText("Computoser 2");
				}
			}
		);
		
		musicDemosView.getCompButton3().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isComp3Playing)
				{
					AudioManager.playComp3();
					isComp3Playing = true;
					musicDemosView.getCompButton3().setText("Stop");
				}
				else
				{
					AudioManager.stopComp3();
					isComp3Playing = false;
					musicDemosView.getCompButton3().setText("Computoser 3");
				}
			}
		);
		
		musicDemosView.getGAButton1().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isGA1Playing)
				{
					AudioManager.playGA1();
					isGA1Playing = true;
					musicDemosView.getGAButton1().setText("Stop");
				}
				else
				{
					AudioManager.stopGA1();
					isGA1Playing = false;
					musicDemosView.getGAButton1().setText("Individual 1");
				}
			}
		);
		
		musicDemosView.getGAButton2().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isGA2Playing)
				{
					AudioManager.playGA2();
					isGA2Playing = true;
					musicDemosView.getGAButton2().setText("Stop");
				}
				else
				{
					AudioManager.stopGA2();
					isGA2Playing = false;
					musicDemosView.getGAButton2().setText("Individual 2");
				}
			}
		);
		
		musicDemosView.getGAButton3().setOnAction
		(
			(ActionEvent event)
			->
			{
				if (! isGA3Playing)
				{
					AudioManager.playGA3();
					isGA3Playing = true;
					musicDemosView.getGAButton3().setText("Stop");
				}
				else
				{
					AudioManager.stopGA3();
					isGA3Playing = false;
					musicDemosView.getGAButton3().setText("Individual 3");
				}
			}
		);
	}
}
