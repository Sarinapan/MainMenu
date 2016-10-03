/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenu;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Sakina Pan
 */
public class MainMenu extends Application {

    private static double xOffset = 0;
    private static double yOffset = 0;
    private Stage MainWindow;
    Scene scene1, scene2, scene3;

    @Override
    public void start(Stage primaryStage) {

        MainWindow = new Stage();
        MainWindow.initStyle(StageStyle.TRANSPARENT);
        MainWindow.getIcons().add(new Image("/mainmenu/CP.PNG"));
        MainWindow.setTitle("Main menu");

        Button scenario = new Button("SCENARIO");
        scenario.setFont(Font.font("segoe print", FontWeight.BOLD, 16));
        scenario.setTextFill(Color.LIGHTGRAY);
        scenario.setStyle("-fx-background-color: #333333");
        scenario.setPrefSize(220, 30);
        scenario.setTranslateX(100);
        scenario.setTranslateY(300);
        scenario.setOnAction(e -> MainWindow.setScene(scene2));

        Button about = new Button("ABOUT");
        about.setFont(Font.font("segoe print", FontWeight.BOLD, 16));
        about.setTextFill(Color.LIGHTGRAY);
        about.setStyle("-fx-background-color: #333333");
        about.setPrefSize(220, 30);
        about.setTranslateX(100);
        about.setTranslateY(310);
        about.setOnAction(e -> MainWindow.setScene(scene3));
        //scenario.setOnAction(e -> MainWindow.setScene(scene2));

        Button ExitCP = new Button("EXIT");
        ExitCP.setFont(Font.font("segoe print", FontWeight.BOLD, 16));
        ExitCP.setTextFill(Color.LIGHTGRAY);
        ExitCP.setStyle("-fx-background-color: #333333");
        ExitCP.setPrefSize(220, 30);
        ExitCP.setTranslateX(100);
        ExitCP.setTranslateY(320);
        //scenario.setOnAction(e -> MainWindow.setScene(scene2));

        Glow shadow = new Glow();
        //Adding the shadow when the mouse cursor is on
        scenario.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                scenario.setEffect(shadow);
            }
        });
//Removing the shadow when the mouse cursor is off
        scenario.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                scenario.setEffect(null);
            }
        });

        //Glow shadow = new Glow();
        //Adding the shadow when the mouse cursor is on
        about.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                about.setEffect(shadow);
            }
        });
//Removing the shadow when the mouse cursor is off
        about.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                about.setEffect(null);
            }
        });
        ExitCP.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                ExitCP.setEffect(shadow);
            }
        });
//Removing the shadow when the mouse cursor is off
        ExitCP.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                ExitCP.setEffect(null);
            }
        });

        ExitCP.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                MainWindow.close();
            }
        });

        // scenario.setBackground(new Background(new BackgroundFill(Color.DIMGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
        //MainWindow
        Image image = new Image("/mainmenu/CTPBG.PNG");
        VBox vbox1 = new VBox(0);
        vbox1.setBackground(new Background(new BackgroundImage(image, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
        vbox1.setPadding(new Insets(100, 120, 20, 90));
        vbox1.getChildren().addAll(scenario, about, ExitCP);
        scene1 = new Scene(vbox1, 600, 600);

        Label Label2Heading = new Label("SCENARIOS");
        Label2Heading.setFont(Font.font("segoe print", FontWeight.BOLD, 20));
        Label2Heading.setTextFill(Color.ORANGE);
        Label2Heading.setPrefSize(260, 140);
        Label2Heading.setTranslateX(160);
        Label2Heading.setTranslateY(-180);

        Button Back2Main = new Button("RETURN TO MENU");
        Back2Main.setFont(Font.font("segoe print", FontWeight.BOLD, 10));
        Back2Main.setTextFill(Color.BLACK);
        Back2Main.setStyle("-fx-background-color: #FFA500");
        Back2Main.setPrefSize(130, 30);
        Back2Main.setTranslateX(-60);
        Back2Main.setTranslateY(250);
        Back2Main.setOnAction(e -> MainWindow.setScene(scene1));

        Image image1 = new Image("/mainmenu/greyScen.jpg");
        VBox vbox2 = new VBox(0);
        vbox2.setBackground(new Background(new BackgroundImage(image1, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
        vbox2.setPadding(new Insets(100, 120, 20, 90));
        vbox2.getChildren().addAll(Back2Main, Label2Heading);
        scene2 = new Scene(vbox2, 600, 400);
        MainWindow.setScene(scene1);

        Button about2Main = new Button("RETURN TO MENU");
        about2Main.setFont(Font.font("segoe print", FontWeight.BOLD, 10));
        about2Main.setTextFill(Color.BLACK);
        about2Main.setStyle("-fx-background-color: #FFA500");
        about2Main.setPrefSize(130, 30);
        about2Main.setTranslateX(-60);
        about2Main.setTranslateY(250);
        about2Main.setOnAction(e -> MainWindow.setScene(scene1));

        Label Label3Heading = new Label("ABOUT");
        Label3Heading.setFont(Font.font("segoe print", FontWeight.BOLD, 20));
        Label3Heading.setTextFill(Color.ORANGE);
        Label3Heading.setPrefSize(260, 140);
        Label3Heading.setTranslateX(160);
        Label3Heading.setTranslateY(-180);

        Image image2 = new Image("/mainmenu/greyScen.jpg");
        VBox vbox3 = new VBox(0);
        vbox3.setBackground(new Background(new BackgroundImage(image1, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
        vbox3.setPadding(new Insets(100, 120, 20, 90));
        vbox3.getChildren().addAll(about2Main, Label3Heading);
        scene3 = new Scene(vbox3, 600, 400);
        MainWindow.setScene(scene1);

        MainWindow.show();

        MainWindow.getScene().setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = MainWindow.getX() - event.getScreenX();
                yOffset = MainWindow.getY() - event.getScreenY();
            }
        });
        MainWindow.getScene().setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                MainWindow.setX(event.getScreenX() + xOffset);
                MainWindow.setY(event.getScreenY() + yOffset);
            }
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
