package com.jdc.wc;

import java.time.LocalTime;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class WorldClockControl {

    @FXML
    private Label jHour;

    @FXML
    private Label jMinute;

    @FXML
    private Label jSecond;

    @FXML
    private Label uHour;

    @FXML
    private Label uMinute;

    @FXML
    private Label mHour;

    @FXML
    private Label mMinute;

    @FXML
    private Label mSecond;

    @FXML
    private Label kHour;

    @FXML
    private Label kMinute;

    @FXML
    private Label kSecond;
    public void initialize() {
    	KeyFrame start = new KeyFrame(Duration.ZERO,new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				LocalTime now = LocalTime.now();
				mHour.setText(String.valueOf(now.getHour()));
				mMinute.setText(String.valueOf(now.getMinute()));
				mSecond.setText(String.valueOf(now.getSecond()));
				
			}
		} );
    	KeyFrame end = new KeyFrame(Duration.seconds(1));
    	Timeline timeLine = new Timeline(start,end);
    	timeLine.setCycleCount(Animation.INDEFINITE);
    	timeLine.play();
    }

}
