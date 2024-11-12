
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {
    Button button;
    @Override
    public void start(Stage primaryStage) {
        
        Label name = new Label("Name:");
        Label email = new Label("Email: ");
        Label age = new Label("Age: ");
        Label date = new Label("Date: ");
        DatePicker datepicker = new DatePicker();

        TextField nameF = new TextField();
        TextField emailF = new TextField();
        emailF.setPromptText("Enter your email");
        TextField ageF = new TextField();
        ageF.setPromptText("Enter your age");
        
        button = new Button();
        button.setText("Enter");
        button.setOnAction(e -> System.out.println("Test!!!"));
        
        BorderPane borderPane = new BorderPane();
        
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(10));
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        gridpane.add(name,0,0);
        gridpane.add(nameF,0,1);
        gridpane.add(email,0,2);
        gridpane.add(emailF,0,3);
        gridpane.add(age,0,4);
        gridpane.add(ageF,0,5);
        gridpane.add(date,0,6);
        gridpane.add(datepicker,0,7);
        gridpane.add(button,0,8);

        borderPane.setLeft(gridpane);
        Label enterPrompt = new Label("Entered Information: ");
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10)); // Adjust top padding as needed for alignment
        vbox.setAlignment(Pos.TOP_LEFT); // Aligns the VBox contents to the top-left
        vbox.getChildren().add(enterPrompt);
        borderPane.setCenter(vbox);
        
        //Set up and display the stage
        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setTitle("Week 10 Homework 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
