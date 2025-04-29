package com.fort;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// The Main App is a child of the Application class, inherits the methods
public class MainApp extends Application {

    // The main method passes the args to the Application.launch method
    public static void main(String[] args) {
        launch(args);
    }

    // This is where the primary stage is set after app launch
    @Override
    public void start(Stage stage) throws Exception {

        // Using javafx.scene.Group for layout. There are other options.
        Group root = new Group();
        // Create a new scene
        Scene scene = new Scene(root, Color.DARKGRAY);

        Image icon = new Image(getClass().getResource("/FortIcon.png").toExternalForm());
        stage.getIcons().add(icon);
        stage.setTitle("FortressBackOffice");
        //Set the scene on the stage
        stage.setScene(scene);
        //Shows the primary stage. Needs to be kept at the end of the start method
        stage.show();
    }
}
