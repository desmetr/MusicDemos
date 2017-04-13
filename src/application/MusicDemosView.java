package application;

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
	private Button beadsMusicDemoButton;
	private Button beadsSampleDemoButton;
	private Button wolframButton1;
	private Button wolframButton2;
	private Button wolframButton3;
	private Button wolframButton3_1;
	private Button wolframButton3_2;
	private Button wolframButton3_3;
	
	public MusicDemosView() 
	{
		super();
		VBox beadsCell = initialiseBeadsCell();
		VBox wolframCell = initialiseWolframCell();
		VBox gaCell = initialiseGeneticsAlgorithmCell();
		VBox computoserCell = initialiseComputoserCell();
		
		GridPane.setConstraints(beadsCell, 0, 0); // column = 0, row = 0
		GridPane.setConstraints(wolframCell, 1, 0); // column = 1, row = 0
		GridPane.setConstraints(gaCell, 0, 1); // column = 0, row = 1
		GridPane.setConstraints(computoserCell, 1, 1); // column = 1, row = 1
		
		getChildren().addAll(beadsCell, wolframCell, gaCell, computoserCell);
	}
	
	public Button getBeadsMusicDemoButton() 	{	return beadsMusicDemoButton;	}
	public Button getBeadsSampleDemoButton() 	{	return beadsSampleDemoButton;	}
	public Button getWolframButton1() 			{	return wolframButton1;			}
	public Button getWolframButton2() 			{	return wolframButton2;			}
	public Button getWolframButton3() 			{	return wolframButton3;			}
	public Button getWolframButton3_1() 		{	return wolframButton3_1;		}
	public Button getWolframButton3_2() 		{	return wolframButton3_2;		}
	public Button getWolframButton3_3() 		{	return wolframButton3_3;		}

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
		beadsMusicDemoButton.setPrefWidth(200);
	        
		beadsSampleDemoButton = new Button("Sample Demo");
		beadsSampleDemoButton.setFont(Font.font("Verdana", 20));
		beadsSampleDemoButton.setTextFill(Color.IVORY);
		beadsSampleDemoButton.setBackground(new Background(new BackgroundFill(Color.DARKGOLDENROD, new CornerRadii(5.0), null)));
		beadsSampleDemoButton.setAlignment(Pos.CENTER);
		beadsSampleDemoButton.setPrefWidth(200);
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(300.0);
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
		result.setPrefHeight(300.0);
		result.setPrefWidth(400.0);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setSpacing(10);
		
		result.getChildren().addAll(wolframLabel, wolframButton1, wolframButton2, wolframButton3, wolframButton3_1, wolframButton3_2, wolframButton3_3);
		
		return result;
	}
	
	private VBox initialiseGeneticsAlgorithmCell()
	{
		VBox result = new VBox();
		
		Label gaLabel = new Label("Genetic Algorithm");
		gaLabel.setTextFill(Color.IVORY);
		gaLabel.setFont(Font.font("Verdana", 20));
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(300.0);
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
		
		result.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGRAY, null, null)));
		result.setPrefHeight(300.0);
		result.setPrefWidth(400.0);
		result.setAlignment(Pos.CENTER);
		result.setStyle("-fx-background-color:" +
                        " #090a0c," +
                        " linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%)," +
                        " linear-gradient(#20262b, #191d22)," +
                        " radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));");
		result.setSpacing(25);
		
		result.getChildren().addAll(computoserLabel);
		
		return result;
	}
}
