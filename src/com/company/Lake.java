package com.company;


public class Lake extends Obstacle {

    private int wide;

    public Lake(int wide){
        this.wide = wide;
    }

    @Override
    public void doIt(Challengeable a) {
        a.swim(wide);
    }
}
