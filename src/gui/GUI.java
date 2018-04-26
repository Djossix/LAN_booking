package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public abstract class GUI extends Application {
	
	Button seat10, candy;
	Stage window;
	Scene seatMap, extras, summary;
	Label total;
	
	public abstract void start(Stage primaryStage) throws Exception;

}
