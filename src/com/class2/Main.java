package com.class2;

public class Main{
    public static void main (String[] args){
        Pen pen1 = new Pen();
        pen1.model = "BIC";
        pen1.color = "Blue";
        pen1.tip = 0.5;
        pen1.charge = 59;
        pen1.covered = false;

        pen1.status();
        pen1.cover();
        pen1.scribble();

        Pen pen2 = new Pen();
        pen2.model = "FABER CASTEL";
        pen2.color = "Black";
        pen2.tip = 0.5;
        pen2.charge = 70;
        pen2.covered = false;

        pen2.status();
        pen2.scribble();
        
    }
}