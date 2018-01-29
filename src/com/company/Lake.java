package com.company;


public class Lake extends Obstacle {

    private int wide;

    public Lake(int wide){
        this.wide = wide;
        this.type = "Озеро";
    }

    @Override
    public void doIt(Challengeable a) {
        a.swim(wide);
    }
}
