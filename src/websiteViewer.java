import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.util.Scanner;

public class websiteViewer extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception{
		Scanner reader = new Scanner(System.in);
		WebView webView = new WebView();
		WebEngine web = webView.getEngine();
		//Ask user to input the website they want
		System.out.println("Enter website URL to access:");
		String website = reader.nextLine();
		
		//Enter the Website to access
		web.load(website);
		
		// Create the VBox
        VBox root = new VBox();
        // Add the WebView to the VBox
        root.getChildren().add(webView);
 
        // Set the Style-properties of the VBox
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: black;");
 
        // Create the Scene
        Scene scene = new Scene(root);
        stage.setTitle("JavaFx Design");
        stage.setScene(scene);
        stage.show();
        
        reader.close();
	}
}