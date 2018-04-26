package gui;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SeatMap extends GUI {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("LAN Booking");
		
		total = new Label("Summary");
		
		seat10 = new Button();
		seat10.setText("A10");
		seat10.setOnAction(e -> {
			System.out.println("Seat A10 was booked.");
			seat10.setText("A10 Booked");
			total.setText(total.getText() + "\nBooked seat: A10");
			window.setScene(extras);
		});
		
		StackPane layoutSeat = new StackPane();
		layoutSeat.getChildren().add(seat10);
		seatMap = new Scene(layoutSeat, 300, 250);
		
	}

}
