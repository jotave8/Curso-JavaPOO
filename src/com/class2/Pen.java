package com.class2;

public class Pen{
    public String model;
    public String color;
    public double tip;
    public int charge;
    public boolean covered;

    void scribble(){
        if (this.covered == true){
            System.out.println("ERROR");
        }
        else{
            System.out.println("SCRIBBLE");
        }
        
    }

    void cover (){
        this.covered = true;
    }

    void uncover(){
        this.covered = false;
    }

    void status(){
        System.out.println("A pen "  + this.color);
        System.out.println("A "+ this.model + " pen");
        System.out.println("Is covered? " + this.covered);
        System.out.println("Pen tip: " + this.tip);
        System.out.println("Pen charge: " + this.charge);
    }
}