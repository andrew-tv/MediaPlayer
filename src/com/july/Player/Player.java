package com.july.Player;

//import java.awt.Color;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class Player extends Application {

	private Stage primaryStage;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		// TODO Auto-generated method stub
		
		Group root = new Group();
		Media media = new Media("file:///~/Downloads/ONUKA_Marika_Misto.mp4");
//		Media media = new Media("https://www.youtube.com/watch?v=hoWCYpxWYxM&list=RDhoWCYpxWYxM");
		MediaPlayer player = new MediaPlayer(media);
		MediaView view = new MediaView(player);

		root.getChildren().add(view);
		Scene scene = new Scene(root, 854, 480, Color.BLACK );
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		player.play();
	}

}
