package com.company;

public class Wall extends Obstacle{
    private int height;

    public Wall(int height){
        this.height = height;
        this.type = "Стена";
    }

    @Override
    public void doIt(Challengeable a) {
        a.jump(this.height);
    }
}
