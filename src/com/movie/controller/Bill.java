package com.movie.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Bill {

    public Label movieName;
    public Label seats;
    public Label audiNo;
    public Label revienu;
    public Label serviceL;
    public Label sbc;
    public Label kkc;
    public Label total;
    private float revenue = 0;
    private float sbcc = 0;
    private float kkcc = 0;

    @FXML
    public void initialize() {
      movieName.setText(MainView.name);
      String seat = "";
        for (String i : Audi.temp){
                seat = seat.concat(i).concat(",  ");
                if(i.contains("A")){
                    revenue = revenue + 320;
                    sbcc = (float) (sbcc + (320*0.05));
                    kkcc = (float) (kkcc + (320*0.05));
                }else if(i.contains("B")){
                    revenue = revenue + 280;
                    sbcc = (float) (sbcc + (280*0.05));
                    kkcc = (float) (kkcc + (280*0.05));
                }else if(i.contains("C")){
                    revenue = revenue + 240;
                    sbcc = (float) (sbcc + (240*0.05));
                    kkcc = (float) (kkcc + (240*0.05));
                }
        }

        seats.setText(seat);
        audiNo.setText(MainView.audii);
        revienu.setText(String.valueOf(revenue));
        serviceL.setText(String.valueOf(Math.round(revenue*14)/100));
        sbc.setText(String.valueOf(sbcc));
        kkc.setText(String.valueOf(kkcc));
        total.setText(String.valueOf(revenue+sbcc+kkcc));


    }
}
