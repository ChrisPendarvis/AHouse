package com.example.ahouse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;
import javafx.scene.Group;



import java.io.IOException;

public class aHouse extends Application {
    private Object Rectangle;

    @Override
    public void start(Stage stage) throws IOException {

        Rectangle bg = new Rectangle(0, 0, 800, 350);
        bg.setFill(Color.LIGHTBLUE);
        Rectangle grass = new Rectangle(0, 350, 800, 550);
        grass.setFill(Color.LIMEGREEN);
        Rectangle redHouse = new Rectangle(100, 150, 600, 550);
        redHouse.setFill(Color.MEDIUMVIOLETRED);
        redHouse.setStroke(Color.BLACK);
        Polygon roof = new Polygon();
        roof.getPoints().addAll(new Double[]{ // Creating Roof
                400.0, 0.0,
                50.0, 175.0,
                750.0, 175.0});
        roof.setFill(Color.WHITE);
        roof.setStroke(Color.BLACK);
        Rectangle belowRoof = new Rectangle(100, 175, 600, 35);
        belowRoof.setFill(Color.WHITE);
        belowRoof.setStroke(Color.BLACK);

        // Setting variables for the stairs
        int w = 50;
        int x = 700;
        int y = 700;
        int z = 12;
        Rectangle[] rect = new Rectangle[11];
        // STAIRS BELOW
        for (int i = 0; i < 11; i++) {
            rect[i] = new Rectangle(w, x, y, z);
            rect[i].setFill(Color.LIGHTGRAY);
            rect[i].setStroke(Color.BLACK);
            w += 10;
            x -= 12;
            y -= 20;
        }
        // Creating columns in front of the house
        Rectangle column1 = new Rectangle(120, 210, 55, 375);
        Rectangle column2 = new Rectangle(285, 210, 55, 375);
        Rectangle column3 = new Rectangle(465, 210, 55, 375);
        Rectangle column4 = new Rectangle(625, 210, 55, 375);
        // Filling the color in white and making the outline black
        column1.setFill(Color.WHITE);
        column2.setFill(Color.WHITE);
        column3.setFill(Color.WHITE);
        column4.setFill(Color.WHITE);
        column1.setStroke(Color.BLACK);
        column2.setStroke(Color.BLACK);
        column3.setStroke(Color.BLACK);
        column4.setStroke(Color.BLACK);
        // Creating circles at the top. Looking back this could've been a loop :P
        Circle circle1 = new Circle(120, 230, 20);
        Circle circle2 = new Circle(175, 230, 20);
        Circle circle3 = new Circle(285, 230, 20);
        Circle circle4 = new Circle(340, 230, 20);
        Circle circle5 = new Circle(465, 230, 20);
        Circle circle6 = new Circle(520, 230, 20);
        Circle circle7 = new Circle(625, 230, 20);
        Circle circle8 = new Circle(680, 230, 20);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        circle3.setFill(Color.WHITE);
        circle3.setStroke(Color.BLACK);
        circle4.setFill(Color.WHITE);
        circle4.setStroke(Color.BLACK);
        circle5.setFill(Color.WHITE);
        circle5.setStroke(Color.BLACK);
        circle6.setFill(Color.WHITE);
        circle6.setStroke(Color.BLACK);
        circle7.setFill(Color.WHITE);
        circle7.setStroke(Color.BLACK);
        circle8.setFill(Color.WHITE);
        circle8.setStroke(Color.BLACK);
        // Base of columns. Also needed to fill these.
        Rectangle bottomCol1 = new Rectangle(110, 560, 75, 20);
        Rectangle bottomCol2 = new Rectangle(275, 560, 75, 20);
        Rectangle bottomCol3 = new Rectangle(455, 560, 75, 20);
        Rectangle bottomCol4 = new Rectangle(615, 560, 75, 20);
        bottomCol1.setFill(Color.WHITE);
        bottomCol1.setStroke(Color.BLACK);
        bottomCol2.setFill(Color.WHITE);
        bottomCol2.setStroke(Color.BLACK);
        bottomCol3.setFill(Color.WHITE);
        bottomCol3.setStroke(Color.BLACK);
        bottomCol4.setFill(Color.WHITE);
        bottomCol4.setStroke(Color.BLACK);
        // Very thin deck rectangle that expands across the entire bottom of the house
        Rectangle deck = new Rectangle(100, 580, 600, 8);
        deck.setFill(Color.LIGHTGRAY);
        deck.setStroke(Color.BLACK);
        // The sign at the top of the door
        Rectangle sign = new Rectangle(358, 250, 90, 60);
        sign.setFill(Color.TAN);
        sign.setStroke(Color.BLACK);
        // The actual door to the house
        Rectangle door = new Rectangle(358, 350, 90, 250);
        door.setFill(Color.WHITE);
        door.setStroke(Color.BLACK);
        // Left and right windows
        Rectangle leftWindow = new Rectangle(190, 400, 80, 200);
        leftWindow.setFill(Color.WHITE);
        leftWindow.setStroke(Color.BLACK);
        Rectangle rightWindow = new Rectangle(533, 400, 80, 200);
        rightWindow.setFill(Color.WHITE);
        rightWindow.setStroke(Color.BLACK);
        // Created black boxes with the intent to loop white lines through them for the windows.
        Rectangle window1 = new Rectangle(205, 410, 50, 160);
        Rectangle window2 = new Rectangle(375, 410, 57, 160);
        Rectangle window3 = new Rectangle(548, 410, 50, 160);
        // The loop below creates 12 lines, puts them into an array, and makes 4 at a time,
        // to go through each black box 4 times, creating windows.
        Rectangle window[] = new Rectangle[12];
        int e = 430; // I declared the value of 430 three times because I needed three loops,
        int f = 430; // and the value of the Y coordinate had to be the same at the start of each
        int g = 430;
        int d = 0;
        while (d < 4) {
            window[d] = new Rectangle(205, e, 50, 10);
            window[d].setFill(Color.WHITE);
            e += 35;
            d++;
            while (d > 3 && d < 8) {
                window[d] = new Rectangle(375, f, 60, 10);
                window[d].setFill(Color.WHITE);
                f += 35;
                d++;
                while (d > 7 && d < 12) {
                    window[d] = new Rectangle(548, g, 50, 10);
                    window[d].setFill(Color.WHITE);
                    g += 35;
                    d++;
                }
            }
        }
        // Just white lines through the center of the three black boxes to split the windows
        Rectangle splitWindowLeft = new Rectangle(223, 410, 15, 175);
        splitWindowLeft.setFill(Color.WHITE);
        Rectangle splitWindowCenter = new Rectangle(396, 410, 15, 175);
        splitWindowCenter.setFill(Color.WHITE);
        Rectangle splitWindowRight = new Rectangle(566, 410, 15, 175);
        splitWindowRight.setFill(Color.WHITE);


        Group gp = new Group(rect[0], rect[1], rect[2], rect[3], rect[4], rect[5], rect[6], rect[7], rect[8], rect[9], rect[10]);
        // I'm not sure if there's a more efficient way of doing this, but I added all
        // the children to one group
        gp.getChildren().add(bg);
        gp.getChildren().add(grass);
        gp.getChildren().add(redHouse);
        gp.getChildren().add(roof);
        gp.getChildren().add(belowRoof);
        gp.getChildren().add(column1);
        gp.getChildren().add(column2);
        gp.getChildren().add(column3);
        gp.getChildren().add(column4);
        gp.getChildren().add(circle1);
        gp.getChildren().add(circle2);
        gp.getChildren().add(circle3);
        gp.getChildren().add(circle4);
        gp.getChildren().add(circle5);
        gp.getChildren().add(circle6);
        gp.getChildren().add(circle7);
        gp.getChildren().add(circle8);
        gp.getChildren().add(bottomCol1);
        gp.getChildren().add(bottomCol2);
        gp.getChildren().add(bottomCol3);
        gp.getChildren().add(bottomCol4);
        gp.getChildren().add(deck);
        gp.getChildren().add(sign);
        gp.getChildren().add(door);
        gp.getChildren().add(leftWindow);
        gp.getChildren().add(rightWindow);
        gp.getChildren().add(window1);
        gp.getChildren().add(window2);
        gp.getChildren().add(window3);
        // A loop to add all 12 lines splitting the black box
        for (int i = 0; i < 12; i++) {
            gp.getChildren().add(window[i]);
        }
        gp.getChildren().add(splitWindowLeft);
        gp.getChildren().add(splitWindowCenter);
        gp.getChildren().add(splitWindowRight);
        // I had to bring the stairs to the front of the drawing
        for (int j = 0; j < 11; j++) {
            rect[j].toFront();
        }
        var scene = new Scene(gp, 800, 800);
        stage.setScene(scene);
        stage.setTitle("A House");
        stage.show();

    }
    public static void main(String[] args) {
        launch();
    }
}