package menu_gui;

import gui.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Menu extends Application {
	
	Button seat10, candy;
	Stage window;
	Scene seatMap, extras, summary;
	Label total;

	public static void main(String[] args) {
		launch(args);

		//javafx.application.Application.launch(Extras.class);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("LAN Booking");
		
		seat10 = new Button();
		seat10.setText("A10");
		seat10.setOnAction(e -> {
			System.out.println("Seat A10 was booked.");
			seat10.setText("A10 Booked");
			total.setText(total.getText() + "\nBooked seat: A10");
			window.setScene(extras);
		});
		
		total = new Label("Summary");
		
		candy = new Button();
		candy.setText("Skittles");
		candy.setOnAction(e -> {
			total.setText(total.getText() + "\nCandy: Skittles");
			window.setScene(summary);
			
		});

		
		StackPane layoutSeat = new StackPane();
		layoutSeat.getChildren().add(seat10);
		seatMap = new Scene(layoutSeat, 300, 250);
		
		StackPane layoutXtras = new StackPane();
		layoutXtras.getChildren().add(candy);
		extras = new Scene(layoutXtras, 300, 250);
		
		StackPane layoutSummary = new StackPane();
		layoutSummary.getChildren().add(total);
		summary = new Scene(layoutSummary, 300, 250);
		
		
		window.setScene(seatMap);
		window.show();

	}


}
