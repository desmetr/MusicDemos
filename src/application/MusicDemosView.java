package application;

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
		
		VBox chordsCell = initialiseChordsCell();
		VBox chordProgressionsCell = initialiseChordProgressionCell();
		VBox wavesCell = initialiseWavesCell();
		VBox beadsCell = initialiseBeadsCell();
		VBox wolframCell = initialiseWolframCell();
//		VBox gaCell = initialiseGeneticsAlgorithmCell();
		VBox computoserCell = initialiseComputoserCell();
		
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

	private VBox initialiseChordsCell()
	{
		VBox result = new VBox();
		Label chordsLabel = new Label("Chords");
		chordsLabel.setTextFill(Color.IVORY);
		chordsLabel.setFont(Font.font("Verdana", 20));
		
		majorChordButton = new Button("Major Chord");
		majorChordButton.setFont(Font.font("Verdana", 20));
		majorChordButton.setTextFill(Color.IVORY);
		majorChordButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		majorChordButton.setAlignment(Pos.CENTER);
	        
		minorChordButton = new Button("Minor Chord");
		minorChordButton.setFont(Font.font("Verdana", 20));
		minorChordButton.setTextFill(Color.IVORY);
		minorChordButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		minorChordButton.setAlignment(Pos.CENTER);
		
		diminishedChordButton = new Button("Diminished Chord");
		diminishedChordButton.setFont(Font.font("Verdana", 20));
		diminishedChordButton.setTextFill(Color.IVORY);
		diminishedChordButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		diminishedChordButton.setAlignment(Pos.CENTER);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(333.0);
		result.setPrefWidth(400.0);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		
		result.setSpacing(25);
		
		result.getChildren().addAll(chordsLabel, majorChordButton, minorChordButton, diminishedChordButton);
		
		return result;
	}
	
	private VBox initialiseChordProgressionCell()
	{
		VBox result = new VBox();
		Label chordProgressionsLabel = new Label("Chord Progressions");
		chordProgressionsLabel.setTextFill(Color.IVORY);
		chordProgressionsLabel.setFont(Font.font("Verdana", 20));
		
		bluesFormButton = new Button("Blues Form");
		bluesFormButton.setFont(Font.font("Verdana", 20));
		bluesFormButton.setTextFill(Color.IVORY);
		bluesFormButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		bluesFormButton.setAlignment(Pos.CENTER);
	        
		I_II_V_I_Button = new Button("I-II-V-I");
		I_II_V_I_Button.setFont(Font.font("Verdana", 20));
		I_II_V_I_Button.setTextFill(Color.IVORY);
		I_II_V_I_Button.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		I_II_V_I_Button.setAlignment(Pos.CENTER);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(333.0);
		result.setPrefWidth(400.0);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		
		result.setSpacing(25);
		
		result.getChildren().addAll(chordProgressionsLabel, bluesFormButton, I_II_V_I_Button);
		
		return result;
	}
	
	private VBox initialiseWavesCell()
	{
		VBox result = new VBox();
		Label wavesLabel = new Label("Waves");
		wavesLabel.setTextFill(Color.IVORY);
		wavesLabel.setFont(Font.font("Verdana", 20));
		
		sineWaveButton = new Button("Sine Wave");
		sineWaveButton.setFont(Font.font("Verdana", 20));
		sineWaveButton.setTextFill(Color.IVORY);
		sineWaveButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		sineWaveButton.setAlignment(Pos.CENTER);
		
		sawWaveButton = new Button("Saw Wave");
		sawWaveButton.setFont(Font.font("Verdana", 20));
		sawWaveButton.setTextFill(Color.IVORY);
		sawWaveButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		sawWaveButton.setAlignment(Pos.CENTER);
		
		squareWaveButton = new Button("Square Wave");
		squareWaveButton.setFont(Font.font("Verdana", 20));
		squareWaveButton.setTextFill(Color.IVORY);
		squareWaveButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		squareWaveButton.setAlignment(Pos.CENTER);
	        
		triangleWaveButton = new Button("Triangle Demo");
		triangleWaveButton.setFont(Font.font("Verdana", 20));
		triangleWaveButton.setTextFill(Color.IVORY);
		triangleWaveButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		triangleWaveButton.setAlignment(Pos.CENTER);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(333.0);
		result.setPrefWidth(400.0);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		
		result.setSpacing(25);
		
		result.getChildren().addAll(wavesLabel, sineWaveButton, sawWaveButton, squareWaveButton, triangleWaveButton);
		
		return result;
	}
	
	private VBox initialiseBeadsCell()
	{
		VBox result = new VBox();
		Label beadsLabel = new Label("Beads");
		beadsLabel.setTextFill(Color.IVORY);
		beadsLabel.setFont(Font.font("Verdana", 20));
		
		beadsMusicDemoButton = new Button("Music Demo");
		beadsMusicDemoButton.setFont(Font.font("Verdana", 20));
		beadsMusicDemoButton.setTextFill(Color.IVORY);
		beadsMusicDemoButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		beadsMusicDemoButton.setAlignment(Pos.CENTER);
	        
		beadsSampleDemoButton = new Button("Sample Demo");
		beadsSampleDemoButton.setFont(Font.font("Verdana", 20));
		beadsSampleDemoButton.setTextFill(Color.IVORY);
		beadsSampleDemoButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		beadsSampleDemoButton.setAlignment(Pos.CENTER);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(333.0);
		result.setPrefWidth(400.0);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		
		result.setSpacing(25);
		
		result.getChildren().addAll(beadsLabel, beadsMusicDemoButton, beadsSampleDemoButton);
		
		return result;
	}
	
	private VBox initialiseWolframCell()
	{
		VBox result = new VBox();
		VBox leftColumn = new VBox();
		VBox rightColumn = new VBox();
		
		Label wolframLabel = new Label("WolframTones");
		wolframLabel.setTextFill(Color.IVORY);
		wolframLabel.setFont(Font.font("Verdana", 20));
		
		wolframButton1 = new Button("Wolfram Demo 1");
		wolframButton1.setFont(Font.font("Verdana", 15));
		wolframButton1.setTextFill(Color.IVORY);
		wolframButton1.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton1.setAlignment(Pos.CENTER);
		
		wolframButton2 = new Button("Wolfram Demo 2");
		wolframButton2.setFont(Font.font("Verdana", 15));
		wolframButton2.setTextFill(Color.IVORY);
		wolframButton2.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton2.setAlignment(Pos.CENTER);
		
		wolframButton3 = new Button("Wolfram Demo 3");
		wolframButton3.setFont(Font.font("Verdana", 15));
		wolframButton3.setTextFill(Color.IVORY);
		wolframButton3.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3.setAlignment(Pos.CENTER);
		
		wolframButton3_1 = new Button("Wolfram Demo 3 Other Scale");
		wolframButton3_1.setFont(Font.font("Verdana", 15));
		wolframButton3_1.setTextFill(Color.IVORY);
		wolframButton3_1.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3_1.setAlignment(Pos.CENTER);
		wolframButton3_1.setPrefWidth(325);
		
		wolframButton3_2 = new Button("Wolfram Demo 3 More NPB");
		wolframButton3_2.setFont(Font.font("Verdana", 15));
		wolframButton3_2.setTextFill(Color.IVORY);
		wolframButton3_2.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3_2.setAlignment(Pos.CENTER);
		wolframButton3_2.setPrefWidth(325);
		
		wolframButton3_3 = new Button("Wolfram Demo 3 Other Random Seed");
		wolframButton3_3.setFont(Font.font("Verdana", 15));
		wolframButton3_3.setTextFill(Color.IVORY);
		wolframButton3_3.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		wolframButton3_3.setAlignment(Pos.CENTER);
		wolframButton3_3.setPrefWidth(325);
		
		leftColumn.setSpacing(10);
		leftColumn.setAlignment(Pos.CENTER_LEFT);
		leftColumn.getChildren().addAll(wolframButton1, wolframButton2, wolframButton3);
		
		rightColumn.setSpacing(10);
		rightColumn.setAlignment(Pos.BOTTOM_RIGHT);
		rightColumn.getChildren().addAll(wolframButton3_1, wolframButton3_2, wolframButton3_3);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(333.0);
		result.setPrefWidth(400.0);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setSpacing(10);
		
		result.getChildren().addAll(wolframLabel, leftColumn, rightColumn);
		
		return result;
	}
	
	private VBox initialiseGeneticsAlgorithmCell()
	{
		VBox result = new VBox();
		
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
		result.setSpacing(25);
		
		result.getChildren().addAll(gaLabel);
		
		return result;
	}
	
	private VBox initialiseComputoserCell()
	{
		VBox result = new VBox();
		
		Label computoserLabel = new Label("Computoser");
		computoserLabel.setTextFill(Color.IVORY);
		computoserLabel.setFont(Font.font("Verdana", 20));
		
		comp1Button = new Button("Computoser 1");
		comp1Button.setFont(Font.font("Verdana", 15));
		comp1Button.setTextFill(Color.IVORY);
		comp1Button.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		comp1Button.setAlignment(Pos.CENTER);
		
		comp2Button = new Button("Computoser 2");
		comp2Button.setFont(Font.font("Verdana", 15));
		comp2Button.setTextFill(Color.IVORY);
		comp2Button.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		comp2Button.setAlignment(Pos.CENTER);
		
		comp3Button = new Button("Computoser 3");
		comp3Button.setFont(Font.font("Verdana", 15));
		comp3Button.setTextFill(Color.IVORY);
		comp3Button.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		comp3Button.setAlignment(Pos.CENTER);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(333.0);
		result.setPrefWidth(400.0);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setSpacing(25);
		
		result.getChildren().addAll(computoserLabel, comp1Button, comp2Button, comp3Button);
		
		return result;
	}
}
