package application;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MusicDemosView extends BorderPane
{
	private Button majorChordButton;
	private Button minorChordButton;
	private Button diminishedChordButton;
	
	private Button sineWaveButton;
	private Button sawWaveButton;
	private Button squareWaveButton;
	private Button triangleWaveButton;
	
	private Button bluesFormButton;
	private Button I_II_V_I_Button;
	
	private Button beadsMusicDemoButton;
	private Button beadsSampleDemoButton;
	
	private Button wolframButton1;
	private Button wolframButton2;
	private Button wolframButton3;
	private Button wolframButton3_1;
	private Button wolframButton3_2;
	private Button wolframButton3_3;
	
	private Button compButton1;
	private Button compButton2;
	private Button compButton3;

	private Button gaButton1;
	private Button gaButton2;
	private Button gaButton3;

	private HBox topHBox;
	private HBox centerHBox;
	
	public MusicDemosView() 
	{
		super();
		topHBox = new HBox();
		centerHBox = new HBox();
		
		GridPane chordsCell = initialiseChordsCell();
		GridPane chordProgressionsCell = initialiseChordProgressionCell();
		GridPane wavesCell = initialiseWavesCell();
		topHBox.getChildren().addAll(chordsCell, chordProgressionsCell, wavesCell);
		setTop(topHBox);
		
		GridPane beadsCell = initialiseBeadsCell();
		GridPane wolframCell = initialiseWolframCell();
		GridPane computoserCell = initialiseComputoserCell();
		GridPane gaCell = initialiseGeneticsAlgorithmCell();
		centerHBox.getChildren().addAll(beadsCell, wolframCell, computoserCell, gaCell);
		setCenter(centerHBox);
	}
	
	public Button getBeadsMusicDemoButton() 	{	return beadsMusicDemoButton;	}
	public Button getBeadsSampleDemoButton() 	{	return beadsSampleDemoButton;	}
	public Button getWolframButton1() 			{	return wolframButton1;			}
	public Button getWolframButton2() 			{	return wolframButton2;			}
	public Button getWolframButton3() 			{	return wolframButton3;			}
	public Button getWolframButton3_1() 		{	return wolframButton3_1;		}
	public Button getWolframButton3_2() 		{	return wolframButton3_2;		}
	public Button getWolframButton3_3() 		{	return wolframButton3_3;		}
	public Button getMajorChordButton() 		{	return majorChordButton;		}
	public Button getMinorChordButton() 		{	return minorChordButton;		}
	public Button getDiminishedChordButton() 	{	return diminishedChordButton;	}
	public Button getSineWaveButton() 			{	return sineWaveButton;			}
	public Button getSawWaveButton() 			{	return sawWaveButton;			}
	public Button getSquareWaveButton() 		{	return squareWaveButton;		}
	public Button getTriangleWaveButton() 		{	return triangleWaveButton;		}
	public Button getBluesFormButton() 			{	return bluesFormButton;			}
	public Button getI_II_V_I_Button() 			{	return I_II_V_I_Button;			}
	public Button getCompButton1() 				{	return compButton1;				}
	public Button getCompButton2() 				{	return compButton2;				}
	public Button getCompButton3() 				{	return compButton3;				}
	public Button getGAButton1() 				{	return gaButton1;				}
	public Button getGAButton2() 				{	return gaButton2;				}
	public Button getGAButton3() 				{	return gaButton3;				}

	private final double FONTSIZE = 16;
	private final double UPPERHEIGHT = 270;
	private final double MIDDLEHEIGHT = 300;
	private final double LOWERHEIGHT = 430;
	private final double TOPWIDTH = 440;
	private final double CENTERWIDTH = 330;
	
	private GridPane initialiseChordsCell()
	{
		GridPane result = new GridPane();
		
		Label chordsLabel = new Label("Chords");
		chordsLabel.setTextFill(Color.IVORY);
		chordsLabel.setFont(Font.font("Verdana", FONTSIZE + 4));
		GridPane.setConstraints(chordsLabel, 0, 0);
		GridPane.setHalignment(chordsLabel, HPos.CENTER);
		
		majorChordButton = new Button("Major Chord");
		majorChordButton.setFont(Font.font("Verdana", FONTSIZE));
		majorChordButton.setTextFill(Color.IVORY);
		majorChordButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		majorChordButton.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(majorChordButton, 0, 1);
		GridPane.setHalignment(majorChordButton, HPos.CENTER);
		
		minorChordButton = new Button("Minor Chord");
		minorChordButton.setFont(Font.font("Verdana", FONTSIZE));
		minorChordButton.setTextFill(Color.IVORY);
		minorChordButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		minorChordButton.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(minorChordButton, 0, 2);
		GridPane.setHalignment(minorChordButton, HPos.CENTER);
		
		diminishedChordButton = new Button("Diminished Chord");
		diminishedChordButton.setFont(Font.font("Verdana", FONTSIZE));
		diminishedChordButton.setTextFill(Color.IVORY);
		diminishedChordButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		diminishedChordButton.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(diminishedChordButton, 0, 3);
		GridPane.setHalignment(diminishedChordButton, HPos.CENTER);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(UPPERHEIGHT);
		result.setPrefWidth(TOPWIDTH);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setVgap(10);
		
		result.getChildren().addAll(chordsLabel, majorChordButton, minorChordButton, diminishedChordButton);
		
		return result;
	}
	
	private GridPane initialiseChordProgressionCell()
	{
		GridPane result = new GridPane();
		
		Label chordProgressionsLabel = new Label("Chord Progressions");
		chordProgressionsLabel.setTextFill(Color.IVORY);
		chordProgressionsLabel.setFont(Font.font("Verdana", FONTSIZE + 4));
		GridPane.setConstraints(chordProgressionsLabel, 0, 0);
		GridPane.setHalignment(chordProgressionsLabel, HPos.CENTER);
		
		bluesFormButton = new Button("Blues Form");
		bluesFormButton.setFont(Font.font("Verdana", FONTSIZE));
		bluesFormButton.setTextFill(Color.IVORY);
		bluesFormButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		bluesFormButton.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(bluesFormButton, 0, 1);
		GridPane.setHalignment(bluesFormButton, HPos.CENTER);
		
		I_II_V_I_Button = new Button("I-II-V-I");
		I_II_V_I_Button.setFont(Font.font("Verdana", FONTSIZE));
		I_II_V_I_Button.setTextFill(Color.IVORY);
		I_II_V_I_Button.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		I_II_V_I_Button.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(I_II_V_I_Button, 0, 2);
		GridPane.setHalignment(I_II_V_I_Button, HPos.CENTER);
		
		Button dummy = new Button();
		dummy.setVisible(false);
		GridPane.setConstraints(dummy, 0, 3);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(UPPERHEIGHT);
		result.setPrefWidth(TOPWIDTH);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setVgap(10);
		
		result.getChildren().addAll(chordProgressionsLabel, bluesFormButton, I_II_V_I_Button, dummy);
		
		return result;
	}
	
	private GridPane initialiseWavesCell()
	{
		GridPane result = new GridPane();
		
		Label wavesLabel = new Label("Waves");
		wavesLabel.setTextFill(Color.IVORY);
		wavesLabel.setFont(Font.font("Verdana", FONTSIZE + 4));
		GridPane.setConstraints(wavesLabel, 0, 0);
		GridPane.setHalignment(wavesLabel, HPos.CENTER);
		
		sineWaveButton = new Button("Sine Wave");
		sineWaveButton.setFont(Font.font("Verdana", FONTSIZE));
		sineWaveButton.setTextFill(Color.IVORY);
		sineWaveButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		sineWaveButton.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(sineWaveButton, 0, 1);
		GridPane.setHalignment(sineWaveButton, HPos.CENTER);
		
		sawWaveButton = new Button("Saw Wave");
		sawWaveButton.setFont(Font.font("Verdana", FONTSIZE));
		sawWaveButton.setTextFill(Color.IVORY);
		sawWaveButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		sawWaveButton.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(sawWaveButton, 0, 2);
		GridPane.setHalignment(sawWaveButton, HPos.CENTER);
		
		squareWaveButton = new Button("Square Wave");
		squareWaveButton.setFont(Font.font("Verdana", FONTSIZE));
		squareWaveButton.setTextFill(Color.IVORY);
		squareWaveButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		squareWaveButton.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(squareWaveButton, 0, 3);
		GridPane.setHalignment(squareWaveButton, HPos.CENTER);
		
		triangleWaveButton = new Button("Triangle Wave");
		triangleWaveButton.setFont(Font.font("Verdana", FONTSIZE));
		triangleWaveButton.setTextFill(Color.IVORY);
		triangleWaveButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		triangleWaveButton.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(triangleWaveButton, 0, 4);
		GridPane.setHalignment(triangleWaveButton, HPos.CENTER);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(MIDDLEHEIGHT);
		result.setPrefWidth(TOPWIDTH);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setVgap(10);
		
		result.getChildren().addAll(wavesLabel, sineWaveButton, sawWaveButton, squareWaveButton, triangleWaveButton);
		
		return result;
	}
	
	private GridPane initialiseBeadsCell()
	{
		GridPane result = new GridPane();
		
		Label beadsLabel = new Label("Beads");
		beadsLabel.setTextFill(Color.IVORY);
		beadsLabel.setFont(Font.font("Verdana", FONTSIZE + 4));
		GridPane.setConstraints(beadsLabel, 0, 0);
		GridPane.setHalignment(beadsLabel, HPos.CENTER);
		
		beadsMusicDemoButton = new Button("Music Demo");
		beadsMusicDemoButton.setFont(Font.font("Verdana", FONTSIZE));
		beadsMusicDemoButton.setTextFill(Color.IVORY);
		beadsMusicDemoButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		beadsMusicDemoButton.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(beadsMusicDemoButton, 0, 1);
		GridPane.setHalignment(beadsMusicDemoButton, HPos.CENTER);
		
		beadsSampleDemoButton = new Button("Sample Demo");
		beadsSampleDemoButton.setFont(Font.font("Verdana", FONTSIZE));
		beadsSampleDemoButton.setTextFill(Color.IVORY);
		beadsSampleDemoButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		beadsSampleDemoButton.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(beadsSampleDemoButton, 0, 2);
		GridPane.setHalignment(beadsSampleDemoButton, HPos.CENTER);
		
		Button dummy1 = new Button();
		dummy1.setVisible(false);
		GridPane.setConstraints(dummy1, 0, 3);
		
		Button dummy2 = new Button();
		dummy2.setVisible(false);
		GridPane.setConstraints(dummy2, 0, 4);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(MIDDLEHEIGHT);
		result.setPrefWidth(CENTERWIDTH);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setVgap(10);
		
		result.getChildren().addAll(beadsLabel, beadsMusicDemoButton, beadsSampleDemoButton, dummy1, dummy2);
		
		return result;
	}
	
	private GridPane initialiseWolframCell()
	{
		GridPane result = new GridPane();
		
		Label wolframLabel = new Label("WolframTones");
		wolframLabel.setTextFill(Color.IVORY);
		wolframLabel.setFont(Font.font("Verdana", FONTSIZE + 4));
		GridPane.setConstraints(wolframLabel, 0, 0);
		GridPane.setColumnSpan(wolframLabel, 2);
		GridPane.setHalignment(wolframLabel, HPos.CENTER);
		
		wolframButton1 = new Button("Wolfram 1");
		wolframButton1.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton1.setTextFill(Color.IVORY);
		wolframButton1.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton1.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(wolframButton1, 0, 1);
		GridPane.setColumnSpan(wolframButton1, 2);
		GridPane.setHalignment(wolframButton1, HPos.CENTER);
		
		wolframButton2 = new Button("Wolfram 2");
		wolframButton2.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton2.setTextFill(Color.IVORY);
		wolframButton2.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton2.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(wolframButton2, 0, 2);
		GridPane.setColumnSpan(wolframButton2, 2);
		GridPane.setHalignment(wolframButton2, HPos.CENTER);
		
		wolframButton3 = new Button("Wolfram 3");
		wolframButton3.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton3.setTextFill(Color.IVORY);
		wolframButton3.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3.setStyle("-fx-cursor: hand;");
		wolframButton3.setPrefWidth(170);
		GridPane.setConstraints(wolframButton3, 0, 3);
		GridPane.setHalignment(wolframButton3, HPos.CENTER);
		
		wolframButton3_1 = new Button("Other Scale");
		wolframButton3_1.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton3_1.setTextFill(Color.IVORY);
		wolframButton3_1.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3_1.setStyle("-fx-cursor: hand;");
		wolframButton3_1.setPrefWidth(170);
		wolframButton3_1.setMinWidth(170);
		wolframButton3_1.setMaxWidth(170);
		GridPane.setConstraints(wolframButton3_1, 1, 3);
		GridPane.setHalignment(wolframButton3_1, HPos.CENTER);
		
		wolframButton3_2 = new Button("More NPB");
		wolframButton3_2.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton3_2.setTextFill(Color.IVORY);
		wolframButton3_2.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3_2.setStyle("-fx-cursor: hand;");
		wolframButton3_2.setPrefWidth(170);
		wolframButton3_2.setMinWidth(170);
		wolframButton3_2.setMaxWidth(170);GridPane.setConstraints(wolframButton3_2, 1, 4);
		GridPane.setHalignment(wolframButton3_2, HPos.CENTER);
		
		wolframButton3_3 = new Button("Random Seed");
		wolframButton3_3.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton3_3.setTextFill(Color.IVORY);
		wolframButton3_3.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3_3.setStyle("-fx-cursor: hand;");
		wolframButton3_3.setPrefWidth(170);
		wolframButton3_3.setMinWidth(170);
		wolframButton3_3.setMaxWidth(170);GridPane.setConstraints(wolframButton3_3, 1, 5);
		GridPane.setHalignment(wolframButton3_3, HPos.CENTER);
				
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(LOWERHEIGHT);
		result.setPrefWidth(CENTERWIDTH);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setVgap(20);
		result.setHgap(20);
		
		result.getChildren().addAll(wolframLabel, wolframButton1, wolframButton2, wolframButton3, wolframButton3_1, wolframButton3_2, wolframButton3_3);
		
		return result;
	}
	
	private GridPane initialiseGeneticsAlgorithmCell()
	{
		GridPane result = new GridPane();
		
		Label gaLabel = new Label("Genetic Algorithm");
		gaLabel.setTextFill(Color.IVORY);
		gaLabel.setFont(Font.font("Verdana", FONTSIZE + 4));
		GridPane.setConstraints(gaLabel, 0, 0);
		GridPane.setHalignment(gaLabel, HPos.CENTER);
		
		gaButton1 = new Button("Individual 1");
		gaButton1.setFont(Font.font("Verdana", FONTSIZE));
		gaButton1.setTextFill(Color.IVORY);
		gaButton1.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		gaButton1.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(gaButton1, 0, 1);
		GridPane.setHalignment(gaButton1, HPos.CENTER);
		
		gaButton2 = new Button("Individual 2");
		gaButton2.setFont(Font.font("Verdana", FONTSIZE));
		gaButton2.setTextFill(Color.IVORY);
		gaButton2.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		gaButton2.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(gaButton2, 0, 2);
		GridPane.setHalignment(gaButton2, HPos.CENTER);
		
		gaButton3 = new Button("Individual 3");
		gaButton3.setFont(Font.font("Verdana", FONTSIZE));
		gaButton3.setTextFill(Color.IVORY);
		gaButton3.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		gaButton3.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(gaButton3, 0, 3);
		GridPane.setHalignment(gaButton3, HPos.CENTER);

		Button dummy1 = new Button();
		dummy1.setVisible(false);
		GridPane.setConstraints(dummy1, 0, 4);
		
		Button dummy2 = new Button();
		dummy2.setVisible(false);
		GridPane.setConstraints(dummy2, 0, 5);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(LOWERHEIGHT);
		result.setPrefWidth(CENTERWIDTH);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setVgap(20);
		
		result.getChildren().addAll(gaLabel, gaButton1, gaButton2, gaButton3, dummy1, dummy2);
		
		return result;
	}
	
	private GridPane initialiseComputoserCell()
	{
		GridPane result = new GridPane();
		
		Label computoserLabel = new Label("Computoser");
		computoserLabel.setTextFill(Color.IVORY);
		computoserLabel.setFont(Font.font("Verdana", FONTSIZE + 4));
		GridPane.setConstraints(computoserLabel, 0, 0);
		GridPane.setHalignment(computoserLabel, HPos.CENTER);
		
		compButton1 = new Button("Computoser 1");
		compButton1.setFont(Font.font("Verdana", FONTSIZE));
		compButton1.setTextFill(Color.IVORY);
		compButton1.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		compButton1.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(compButton1, 0, 1);
		GridPane.setHalignment(compButton1, HPos.CENTER);
		
		compButton2 = new Button("Computoser 2");
		compButton2.setFont(Font.font("Verdana", FONTSIZE));
		compButton2.setTextFill(Color.IVORY);
		compButton2.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		compButton2.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(compButton2, 0, 2);
		GridPane.setHalignment(compButton2, HPos.CENTER);
		
		compButton3 = new Button("Computoser 3");
		compButton3.setFont(Font.font("Verdana", FONTSIZE));
		compButton3.setTextFill(Color.IVORY);
		compButton3.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		compButton3.setStyle("-fx-cursor: hand;");
		GridPane.setConstraints(compButton3, 0, 3);
		GridPane.setHalignment(compButton3, HPos.CENTER);

		Button dummy1 = new Button();
		dummy1.setVisible(false);
		GridPane.setConstraints(dummy1, 0, 4);
		
		Button dummy2 = new Button();
		dummy2.setVisible(false);
		GridPane.setConstraints(dummy2, 0, 5);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(LOWERHEIGHT);
		result.setPrefWidth(CENTERWIDTH);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setVgap(20);
		
		result.getChildren().addAll(computoserLabel, compButton1, compButton2, compButton3, dummy1, dummy2);
		
		return result;
	}
}
