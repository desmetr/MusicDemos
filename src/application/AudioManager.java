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

    private static MediaPlayer playerWolfram1;
    private static MediaPlayer playerWolfram2;
    private static MediaPlayer playerWolfram3;
    private static MediaPlayer playerWolfram3_1;
    private static MediaPlayer playerWolfram3_2;
    private static MediaPlayer playerWolfram3_3;

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
    
    public static void playSample()
    {
    	SampleDemo sampleDemo = new SampleDemo();
    	sampleDemo.play();
    }
    
    public static void playMusic()
    {
    	MusicDemo musicDemo = new MusicDemo();
    	musicDemo.play();
    }
    
}
