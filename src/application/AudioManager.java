package application;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import tutorial.SampleDemo;
import tutorial.MusicDemo;

public class AudioManager
{
    private static Media wolfram1 = new Media(new File("wav/wolfram1.wav").toURI().toString());
    private static Media wolfram2 = new Media(new File("wav/wolfram2.wav").toURI().toString());
    private static Media wolfram3 = new Media(new File("wav/wolfram3.wav").toURI().toString());
    private static Media wolfram3_1 = new Media(new File("wav/wolfram3_1.wav").toURI().toString());
    private static Media wolfram3_2 = new Media(new File("wav/wolfram3_2.wav").toURI().toString());
    private static Media wolfram3_3 = new Media(new File("wav/wolfram3_3.wav").toURI().toString());
   
    private static Media sineWave = new Media(new File("wav/440sine.wav").toURI().toString());
    private static Media sawWave = new Media(new File("wav/440saw.wav").toURI().toString());
    private static Media squareWave = new Media(new File("wav/440square.wav").toURI().toString());
    private static Media triangleWave = new Media(new File("wav/440triangle.wav").toURI().toString());
    
    private static Media bluesForm = new Media(new File("wav/bluesform.wav").toURI().toString());
    private static Media I_II_V_I = new Media(new File("wav/1251.wav").toURI().toString());
    
    private static Media majorChord = new Media(new File("wav/majorchord.wav").toURI().toString());
    private static Media minorChord = new Media(new File("wav/minorchord.wav").toURI().toString());
    private static Media diminishedChord = new Media(new File("wav/diminishedchord.wav").toURI().toString());
    
    private static Media comp1 = new Media(new File("wav/comp1.wav").toURI().toString());
    private static Media comp2 = new Media(new File("wav/comp2.wav").toURI().toString());
    private static Media comp3 = new Media(new File("wav/comp3.wav").toURI().toString());
    
    private static MediaPlayer playerWolfram1;
    private static MediaPlayer playerWolfram2;
    private static MediaPlayer playerWolfram3;
    private static MediaPlayer playerWolfram3_1;
    private static MediaPlayer playerWolfram3_2;
    private static MediaPlayer playerWolfram3_3;
    
    private static MediaPlayer playerSine;
    private static MediaPlayer playerSaw;
    private static MediaPlayer playerSquare;
    private static MediaPlayer playerTriangle;
    
    private static MediaPlayer playerBluesForm;
    private static MediaPlayer player1251;
    
    private static MediaPlayer playerMajorChord;
    private static MediaPlayer playerMinorChord;
    private static MediaPlayer playerDiminishedChord;
    
    private static MediaPlayer playerComp1;
    private static MediaPlayer playerComp2;
    private static MediaPlayer playerComp3;
    
    private static MusicDemo musicDemo;
    private static SampleDemo sampleDemo;
    
    public static boolean isBeadsMusicPlaying = false;
    public static boolean isBeadsSamplePlaying = false;

    public static void playWolfram1()
    {
    	playerWolfram1 = new MediaPlayer(wolfram1);
        playerWolfram1.play();
    }

    public static void playWolfram2()
    {
    	playerWolfram2 = new MediaPlayer(wolfram2);
        playerWolfram2.play();
    }
    
    public static void playWolfram3()
    {
    	playerWolfram3 = new MediaPlayer(wolfram3);
        playerWolfram3.play();
    }
    
    public static void playWolfram3_1()
    {
    	playerWolfram3_1 = new MediaPlayer(wolfram3_1);
        playerWolfram3_1.play();
    }
    
    public static void playWolfram3_2()
    {
    	playerWolfram3_2 = new MediaPlayer(wolfram3_2);
        playerWolfram3_2.play();
    }
    
    public static void playWolfram3_3()
    {
    	playerWolfram3_3 = new MediaPlayer(wolfram3_3);
        playerWolfram3_3.play();
    }
    
    public static void playSineWave()
    {
    	playerSine = new MediaPlayer(sineWave);
        playerSine.play();
    }
    
    public static void playSawWave()
    {
    	playerSaw = new MediaPlayer(sawWave);
        playerSaw.play();
    }
    
    public static void playSquareWave()
    {
    	playerSquare = new MediaPlayer(squareWave);
        playerSquare.play();
    }
    
    public static void playTriangleWave()
    {
    	playerTriangle = new MediaPlayer(triangleWave);
        playerTriangle.play();
    }
    
    public static void playBluesForm()
    {
    	playerBluesForm = new MediaPlayer(bluesForm);
        playerBluesForm.play();
    }
   
    public static void play1251()
    {
    	player1251 = new MediaPlayer(I_II_V_I);
        player1251.play();
    }
    
    public static void playMajorChord()
    {
    	playerMajorChord = new MediaPlayer(majorChord);
        playerMajorChord.play();
    }
    
    public static void playMinorChord()
    {
    	playerMinorChord = new MediaPlayer(minorChord);
        playerMinorChord.play();
    }
    
    public static void playDiminishedChord()
    {
    	playerDiminishedChord = new MediaPlayer(diminishedChord);
        playerDiminishedChord.play();
    }
    
    public static void playComp1()
    {
    	playerComp1 = new MediaPlayer(comp1);
        playerComp1.play();
    }
    
    public static void playComp2()
    {
    	playerComp2 = new MediaPlayer(comp2);
        playerComp2.play();
    }
    
    public static void playComp3()
    {
    	playerComp3 = new MediaPlayer(comp3);
        playerComp3.play();
    }
    
    public static void playSample()
    {
    	sampleDemo = new SampleDemo();
    	sampleDemo.play();
    	isBeadsSamplePlaying = true;
    }
    
    public static void playMusic()
    {
    	musicDemo = new MusicDemo();
    	musicDemo.play();
    	isBeadsMusicPlaying = true;
    }
    
    public static void stopSample()
    {
    	sampleDemo.getAc().stop();
    	isBeadsSamplePlaying = false;
    }
    
    public static void stopMusic()
    {
    	musicDemo.getAc().stop();
    	isBeadsMusicPlaying = false;
    }
}
