package com.movie.controller;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class Audi {
    public Button A1, A2, A3, A4, A5, A6, A7, A8, A9, B1, B2, B3, B4, B5,B6,B7,B8,B9,C1, C2, C3, C4, C5, C6, C7,C8,C9;
    public static ArrayList<String> temp = new ArrayList<>();

    @FXML
    public void initialize() {
        switch (Integer.parseInt(MainView.audii)){
            case 1:
                A1.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A2.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A3.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A4.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A5.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A6.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A7.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A8.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A9.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

                B1.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B2.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B3.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B4.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B5.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

                C2.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C3.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C4.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C5.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C6.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C7.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                break;
            case 2:
                A1.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A2.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A3.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A4.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A5.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A6.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A7.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A8.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A9.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

                B2.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B3.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B4.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B5.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B6.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

                C1.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C2.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C3.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C4.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C5.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C6.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C7.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                break;
            case 3:
                A1.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A2.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A3.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A4.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                A5.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

                B1.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B2.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B3.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B4.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B5.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B6.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B7.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                B8.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());

                C1.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C2.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C3.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C4.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C5.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C6.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C7.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C8.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                C9.addEventHandler(MouseEvent.MOUSE_CLICKED, new MyEventHandler());
                break;
        }

    }

    private class MyEventHandler implements EventHandler<Event> {
        @Override
        public void handle(Event evt) {
            String id = ((Control) evt.getSource()).getId();
            if(!temp.contains(id)){
                temp.add(id);
            }
            ((Control) evt.getSource()).setStyle("-fx-background-color: #ff0000;");
            MainView.sendData(String.valueOf(temp.size()));
        }
    }
}