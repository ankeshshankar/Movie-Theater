package com.movie.controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainView {

    public  ChoiceBox movieName;
    public ChoiceBox audiNumber;
    public AnchorPane avalibleSeats;
    public Button confirmBook;
    public Button reset;
    public Label numberOfSeat;
    private static String number;
    public Button refresh;
    public AnchorPane home;
    public AnchorPane bill;
    public static String name;
    public static String audii;

    @FXML
    public void initialize(){
       String[] movie = {"Endgame","Captain Marvel","Aladdin","Spider-Man","Toy Story 4","The Wandering Earth","The Hidden World","Detective Pikachu","Battle Angel","Godzilla"};
       movieName.setItems(FXCollections.observableArrayList(movie));
       String[] audi = {"1","2","3"};
       audiNumber.setItems(FXCollections.observableArrayList(audi));

        reset.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
    }

    public void LoadAudi(ActionEvent actionEvent) throws IOException {
        String audi = (String) audiNumber.getSelectionModel().getSelectedItem();
        audii = audi;
        AnchorPane pane;
        if(movieName.getSelectionModel().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please Select Movie name First");
            alert.showAndWait();
        }else{
            switch (Integer.parseInt(audi)){
                case 1: pane = FXMLLoader.load(getClass().getResource("./../view/audiOne.fxml"));
                    avalibleSeats.getChildren().setAll(pane);
                    break;
                case 2: pane = FXMLLoader.load(getClass().getResource("./../view/audiTwo.fxml"));
                    avalibleSeats.getChildren().setAll(pane);
                    break;
                case 3: pane = FXMLLoader.load(getClass().getResource("./../view/audiThree.fxml"));
                    avalibleSeats.getChildren().setAll(pane);
                    break;
            }
        }
    }

    public static void sendData(String num){
        number = num;
    }
    public void setData(){
        numberOfSeat.setText(number);
    }

    public void showBill(MouseEvent mouseEvent) throws IOException {
        AnchorPane pane;
        pane = FXMLLoader.load(getClass().getResource("./../view/bill.fxml"));
        bill.getChildren().setAll(pane);

    }

    public void sendName(ActionEvent mouseEvent) {
       name = movieName.getValue().toString();
    }

    private class MyEventHandler implements EventHandler<Event> {
        @Override
        public void handle(Event event) {
            Audi.temp.clear();
            AnchorPane pane;
            try {
                pane = FXMLLoader.load(getClass().getResource("./../view/MainView.fxml"));
                home.getChildren().setAll(pane);
            } catch (IOException e) {
                e.printStackTrace();
            }

            

        }
    }
}
