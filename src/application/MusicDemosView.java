package application;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MusicDemosView extends GridPane
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
	
	private Button comp1Button;
	private Button comp2Button;
	private Button comp3Button;

	public MusicDemosView() 
	{
		super();
		
		GridPane chordsCell = initialiseChordsCell();
		GridPane chordProgressionsCell = initialiseChordProgressionCell();
		GridPane wavesCell = initialiseWavesCell();
		GridPane beadsCell = initialiseBeadsCell();
		GridPane wolframCell = initialiseWolframCell();
//		VBox gaCell = initialiseGeneticsAlgorithmCell();
		GridPane computoserCell = initialiseComputoserCell();
		
		GridPane.setConstraints(chordsCell, 0, 0); // column = 0, row = 0
		GridPane.setConstraints(chordProgressionsCell, 1, 0);
		GridPane.setConstraints(wavesCell, 0, 1);
		GridPane.setConstraints(beadsCell, 1, 1);
		GridPane.setConstraints(wolframCell, 0, 2);
//		GridPane.setConstraints(gaCell, 0, 1);
		GridPane.setConstraints(computoserCell, 1, 2);
		
		getChildren().addAll(chordsCell, chordProgressionsCell, wavesCell, beadsCell, wolframCell, computoserCell);
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
	public Button getComp1Button() 				{	return comp1Button;				}
	public Button getComp2Button() 				{	return comp2Button;				}
	public Button getComp3Button() 				{	return comp3Button;				}

	private final double FONTSIZE = 16;
	private final double UPPERHEIGHT = 270;
	private final double MIDDLEHEIGHT = 300;
	private final double LOWERHEIGHT = 430;
	
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
		GridPane.setConstraints(majorChordButton, 0, 1);
		GridPane.setHalignment(majorChordButton, HPos.CENTER);
		
		minorChordButton = new Button("Minor Chord");
		minorChordButton.setFont(Font.font("Verdana", FONTSIZE));
		minorChordButton.setTextFill(Color.IVORY);
		minorChordButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		GridPane.setConstraints(minorChordButton, 0, 2);
		GridPane.setHalignment(minorChordButton, HPos.CENTER);
		
		diminishedChordButton = new Button("Diminished Chord");
		diminishedChordButton.setFont(Font.font("Verdana", FONTSIZE));
		diminishedChordButton.setTextFill(Color.IVORY);
		diminishedChordButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		GridPane.setConstraints(diminishedChordButton, 0, 3);
		GridPane.setHalignment(diminishedChordButton, HPos.CENTER);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(UPPERHEIGHT);
		result.setPrefWidth(400.0);
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
		GridPane.setConstraints(bluesFormButton, 0, 1);
		GridPane.setHalignment(bluesFormButton, HPos.CENTER);
		
		I_II_V_I_Button = new Button("I-II-V-I");
		I_II_V_I_Button.setFont(Font.font("Verdana", FONTSIZE));
		I_II_V_I_Button.setTextFill(Color.IVORY);
		I_II_V_I_Button.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		GridPane.setConstraints(I_II_V_I_Button, 0, 2);
		GridPane.setHalignment(I_II_V_I_Button, HPos.CENTER);
		
		Button dummy = new Button();
		dummy.setVisible(false);
		GridPane.setConstraints(dummy, 0, 3);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(UPPERHEIGHT);
		result.setPrefWidth(400.0);
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
		GridPane.setConstraints(sineWaveButton, 0, 1);
		GridPane.setHalignment(sineWaveButton, HPos.CENTER);
		
		sawWaveButton = new Button("Saw Wave");
		sawWaveButton.setFont(Font.font("Verdana", FONTSIZE));
		sawWaveButton.setTextFill(Color.IVORY);
		sawWaveButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		GridPane.setConstraints(sawWaveButton, 0, 2);
		GridPane.setHalignment(sawWaveButton, HPos.CENTER);
		
		squareWaveButton = new Button("Square Wave");
		squareWaveButton.setFont(Font.font("Verdana", FONTSIZE));
		squareWaveButton.setTextFill(Color.IVORY);
		squareWaveButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		GridPane.setConstraints(squareWaveButton, 0, 3);
		GridPane.setHalignment(squareWaveButton, HPos.CENTER);
		
		triangleWaveButton = new Button("Triangle Wave");
		triangleWaveButton.setFont(Font.font("Verdana", FONTSIZE));
		triangleWaveButton.setTextFill(Color.IVORY);
		triangleWaveButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		GridPane.setConstraints(triangleWaveButton, 0, 4);
		GridPane.setHalignment(triangleWaveButton, HPos.CENTER);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(MIDDLEHEIGHT);
		result.setPrefWidth(400.0);
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
		GridPane.setConstraints(beadsMusicDemoButton, 0, 1);
		GridPane.setHalignment(beadsMusicDemoButton, HPos.CENTER);
		
		beadsSampleDemoButton = new Button("Sample Demo");
		beadsSampleDemoButton.setFont(Font.font("Verdana", FONTSIZE));
		beadsSampleDemoButton.setTextFill(Color.IVORY);
		beadsSampleDemoButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
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
		result.setPrefWidth(400.0);
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
		
		wolframButton1 = new Button("Wolfram Demo 1");
		wolframButton1.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton1.setTextFill(Color.IVORY);
		wolframButton1.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		GridPane.setConstraints(wolframButton1, 0, 1);
		GridPane.setColumnSpan(wolframButton1, 2);
		GridPane.setHalignment(wolframButton1, HPos.CENTER);
		
		wolframButton2 = new Button("Wolfram Demo 2");
		wolframButton2.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton2.setTextFill(Color.IVORY);
		wolframButton2.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		GridPane.setConstraints(wolframButton2, 0, 2);
		GridPane.setColumnSpan(wolframButton2, 2);
		GridPane.setHalignment(wolframButton2, HPos.CENTER);
		
		wolframButton3 = new Button("Wolfram Demo 3");
		wolframButton3.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton3.setTextFill(Color.IVORY);
		wolframButton3.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3.setPrefWidth(170);
		GridPane.setConstraints(wolframButton3, 0, 3);
		GridPane.setHalignment(wolframButton3, HPos.CENTER);
		
		wolframButton3_1 = new Button("Other Scale");
		wolframButton3_1.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton3_1.setTextFill(Color.IVORY);
		wolframButton3_1.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3_1.setPrefWidth(170);
		wolframButton3_1.setMinWidth(170);
		wolframButton3_1.setMaxWidth(170);
		GridPane.setConstraints(wolframButton3_1, 1, 3);
		GridPane.setHalignment(wolframButton3_1, HPos.CENTER);
		
		wolframButton3_2 = new Button("More NPB");
		wolframButton3_2.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton3_2.setTextFill(Color.IVORY);
		wolframButton3_2.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3_2.setPrefWidth(170);
		wolframButton3_2.setMinWidth(170);
		wolframButton3_2.setMaxWidth(170);GridPane.setConstraints(wolframButton3_2, 1, 4);
		GridPane.setHalignment(wolframButton3_2, HPos.CENTER);
		
		wolframButton3_3 = new Button("Random Seed");
		wolframButton3_3.setFont(Font.font("Verdana", FONTSIZE));
		wolframButton3_3.setTextFill(Color.IVORY);
		wolframButton3_3.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3_3.setPrefWidth(170);
		wolframButton3_3.setMinWidth(170);
		wolframButton3_3.setMaxWidth(170);GridPane.setConstraints(wolframButton3_3, 1, 5);
		GridPane.setHalignment(wolframButton3_3, HPos.CENTER);
				
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(LOWERHEIGHT);
		result.setPrefWidth(400.0);
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
		gaLabel.setFont(Font.font("Verdana", 20));
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(333.0);
		result.setPrefWidth(400.0);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		
		result.getChildren().addAll(gaLabel);
		
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
		
		comp1Button = new Button("Computoser 1");
		comp1Button.setFont(Font.font("Verdana", FONTSIZE));
		comp1Button.setTextFill(Color.IVORY);
		comp1Button.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		GridPane.setConstraints(comp1Button, 0, 1);
		GridPane.setHalignment(comp1Button, HPos.CENTER);
		
		comp2Button = new Button("Computoser 2");
		comp2Button.setFont(Font.font("Verdana", FONTSIZE));
		comp2Button.setTextFill(Color.IVORY);
		comp2Button.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		GridPane.setConstraints(comp2Button, 0, 2);
		GridPane.setHalignment(comp2Button, HPos.CENTER);
		
		comp3Button = new Button("Computoser 3");
		comp3Button.setFont(Font.font("Verdana", FONTSIZE));
		comp3Button.setTextFill(Color.IVORY);
		comp3Button.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		GridPane.setConstraints(comp3Button, 0, 3);
		GridPane.setHalignment(comp3Button, HPos.CENTER);

		Button dummy1 = new Button();
		dummy1.setVisible(false);
		GridPane.setConstraints(dummy1, 0, 4);
		
		Button dummy2 = new Button();
		dummy2.setVisible(false);
		GridPane.setConstraints(dummy2, 0, 5);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(LOWERHEIGHT);
		result.setPrefWidth(400.0);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setVgap(20);
		
		result.getChildren().addAll(computoserLabel, comp1Button, comp2Button, comp3Button, dummy1, dummy2);
		
		return result;
	}
}
