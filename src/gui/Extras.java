package gui;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Extras extends GUI {

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("LAN Booking");
		
		total = new Label("Summary");
		
		candy = new Button();
		candy.setText("Skittles");
		candy.setOnAction(e -> {
			total.setText(total.getText() + "\nCandy: Skittles");
			window.setScene(summary);
			
		});
		
		
		StackPane layoutXtras = new StackPane();
		layoutXtras.getChildren().add(candy);
		extras = new Scene(layoutXtras, 300, 250);
	
		window.setScene(extras);
		window.show();
	}

}
