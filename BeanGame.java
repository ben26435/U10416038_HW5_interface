import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
//U10416038 °¨¹Å¨}
public class BeanGame extends Application{
	@Override  // Override the start method in the Application class
	public void start(Stage primaryStage) {
		//Create a pane
		Pane pane = new Pane();
		//Create polyline
		Polyline side = new Polyline();
		//draw the polyline
		side.getPoints().addAll(210.0,50.0,210.0,90.0,110.0,300.0,110.0,360.0,350.0,360.0,350.0,300.0,250.0,90.0,250.0,50.0);
		//paint white the shape of polyline
		side.setFill(Color.WHITE);
		//add polyline to pane
		pane.getChildren().add(side);
		//Create the lines
		Line line1 = new Line(140.0,300.0,140.0,360.0);
		Line line2 = new Line(170.0,300.0,170.0,360.0);
		Line line3 = new Line(200.0,300.0,200.0,360.0);
		Line line4 = new Line(230.0,300.0,230.0,360.0);
		Line line5 = new Line(260.0,300.0,260.0,360.0);
		Line line6 = new Line(290.0,300.0,290.0,360.0);
		Line line7 = new Line(320.0,300.0,320.0,360.0);
		//add lines to pane
		pane.getChildren().add(line1);
		pane.getChildren().add(line2);
		pane.getChildren().add(line3);
		pane.getChildren().add(line4);
		pane.getChildren().add(line5);
		pane.getChildren().add(line6);
		pane.getChildren().add(line7);
		//Create the circles
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle();
		Circle circle4 = new Circle();
		Circle circle5 = new Circle();
		Circle circle6 = new Circle();
		Circle circle7 = new Circle();
		Circle circle8 = new Circle();
		Circle circle9 = new Circle();
		Circle circle10 = new Circle();
		Circle circle11 = new Circle();
		Circle circle12 = new Circle();
		Circle circle13 = new Circle();
		Circle circle14 = new Circle();
		Circle circle15 = new Circle();
		Circle circle16 = new Circle();
		Circle circle17 = new Circle();
		Circle circle18 = new Circle();
		Circle circle19 = new Circle();
		Circle circle20 = new Circle();
		Circle circle21 = new Circle();
		Circle circle22 = new Circle();
		Circle circle23 = new Circle();
		Circle circle24 = new Circle();
		Circle circle25 = new Circle();
		Circle circle26 = new Circle();
		Circle circle27 = new Circle();
		Circle circle28 = new Circle();
		//Set circles' Radius
		circle1.setRadius(5.0);
		circle2.setRadius(5.0);
		circle3.setRadius(5.0);
		circle4.setRadius(5.0);
		circle5.setRadius(5.0);
		circle6.setRadius(5.0);
		circle7.setRadius(5.0);
		circle8.setRadius(5.0);
		circle9.setRadius(5.0);
		circle10.setRadius(5.0);
		circle11.setRadius(5.0);
		circle12.setRadius(5.0);
		circle13.setRadius(5.0);
		circle14.setRadius(5.0);
		circle15.setRadius(5.0);
		circle16.setRadius(5.0);
		circle17.setRadius(5.0);
		circle18.setRadius(5.0);
		circle19.setRadius(5.0);
		circle20.setRadius(5.0);
		circle21.setRadius(5.0);
		circle22.setRadius(5.0);
		circle23.setRadius(5.0);
		circle24.setRadius(5.0);
		circle25.setRadius(5.0);
		circle26.setRadius(5.0);
		circle27.setRadius(5.0);
		circle28.setRadius(5.0);
		
		//Set circles X
		circle1.setLayoutX(140.0);
		circle2.setLayoutX(170.0);
		circle3.setLayoutX(200.0);
		circle4.setLayoutX(230.0);
		circle5.setLayoutX(260.0);
		circle6.setLayoutX(290.0);
		circle7.setLayoutX(320.0);
		circle8.setLayoutX(155.0);
		circle9.setLayoutX(185.0);
		circle10.setLayoutX(215.0);
		circle11.setLayoutX(245.0);
		circle12.setLayoutX(275.0);
		circle13.setLayoutX(305.0);
		circle14.setLayoutX(170.0);
		circle15.setLayoutX(200.0);
		circle16.setLayoutX(230.0);
		circle17.setLayoutX(260.0);
		circle18.setLayoutX(290.0);
		circle19.setLayoutX(185.0);
		circle20.setLayoutX(215.0);
		circle21.setLayoutX(245.0);
		circle22.setLayoutX(275.0);
		circle23.setLayoutX(200.0);
		circle24.setLayoutX(230.0);
		circle25.setLayoutX(260.0);
		circle26.setLayoutX(215.0);
		circle27.setLayoutX(245.0);
		circle28.setLayoutX(230.0);
		
		//Set circles Y
		circle1.setLayoutY(290.0);
		circle2.setLayoutY(290.0);
		circle3.setLayoutY(290.0);
		circle4.setLayoutY(290.0);
		circle5.setLayoutY(290.0);
		circle6.setLayoutY(290.0);
		circle7.setLayoutY(290.0);
		circle8.setLayoutY(260.0);
		circle9.setLayoutY(260.0);
		circle10.setLayoutY(260.0);
		circle11.setLayoutY(260.0);
		circle12.setLayoutY(260.0);
		circle13.setLayoutY(260.0);
		circle14.setLayoutY(230.0);
		circle15.setLayoutY(230.0);
		circle16.setLayoutY(230.0);
		circle17.setLayoutY(230.0);
		circle18.setLayoutY(230.0);
		circle19.setLayoutY(200.0);
		circle20.setLayoutY(200.0);
		circle21.setLayoutY(200.0);
		circle22.setLayoutY(200.0);
		circle23.setLayoutY(170.0);
		circle24.setLayoutY(170.0);
		circle25.setLayoutY(170.0);
		circle26.setLayoutY(140.0);
		circle27.setLayoutY(140.0);
		circle28.setLayoutY(110.0);
		
		//Add circles to pane
		pane.getChildren().add(circle1);
		pane.getChildren().add(circle2);
		pane.getChildren().add(circle3);
		pane.getChildren().add(circle4);
		pane.getChildren().add(circle5);
		pane.getChildren().add(circle6);
		pane.getChildren().add(circle7);
		pane.getChildren().add(circle8);
		pane.getChildren().add(circle9);
		pane.getChildren().add(circle10);
		pane.getChildren().add(circle11);
		pane.getChildren().add(circle12);
		pane.getChildren().add(circle13);
		pane.getChildren().add(circle14);
		pane.getChildren().add(circle15);
		pane.getChildren().add(circle16);
		pane.getChildren().add(circle17);
		pane.getChildren().add(circle18);
		pane.getChildren().add(circle19);
		pane.getChildren().add(circle20);
		pane.getChildren().add(circle21);
		pane.getChildren().add(circle22);
		pane.getChildren().add(circle23);
		pane.getChildren().add(circle24);
		pane.getChildren().add(circle25);
		pane.getChildren().add(circle26);
		pane.getChildren().add(circle27);
		pane.getChildren().add(circle28);
		
	//Set for stage and scene
	
	Scene scene = new Scene(pane, 460, 380 , Color.GREY);
	
    primaryStage.setResizable(false);
    primaryStage.setTitle("U10416038   BeanGame");
	primaryStage.setScene(scene);
	primaryStage.show();
	}
	//Main method
	public static void main(String[] args) {
		launch(args);
	}
}