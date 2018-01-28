package com.company;

public abstract class Animal implements Challengeable{
    protected String name;
    protected int maxRun;
    protected int maxJump;
    protected int maxSwim;
    protected boolean onDistance = true;

    //public Animal(){}

    public Animal(String name, String type, int maxJump, int maxRun, int maxSwim){
        if (maxSwim<0) maxSwim = 0;
        if (maxRun<0) maxRun = 0;
        if (maxJump<0) maxJump = 0;
        if (type=="Dog"){
            if (maxJump>2) maxJump = 2;
            if (maxRun>100) maxRun = 100;
            if (maxSwim>100) maxSwim = 100;
        }
        if (type=="Cat"){
            if (maxJump>2) maxJump = 2;
            if (maxRun>70) maxRun = 70;
        }

        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int run){
        if (run<maxRun) {
            System.out.println(this.name + " пробежал " + run + "м.");
        } else {
            System.out.println(this.name + " не смог пробежать " + run + "м.");
            onDistance = false;
        }
    }

    public void swim(int swim){
        if (swim<maxSwim) {
            System.out.println(this.name + " проплыл " + swim + "м.");
        } else {
            System.out.println(this.name + " не смог проплыть " + swim + "м.");
            onDistance = false;
        }
    }

    public void jump(int jump){
        if (jump<maxJump) {
            System.out.println(this.name + " перепрыгнул " + jump + "м.");
        } else {
            System.out.println(this.name + " не смог перепрыгнуть " + jump + "м.");
            onDistance = false;
        }
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void getInfo(){
        if (onDistance) {
            System.out.println(this.name + " прошел марафон");
        } else System.out.println(this.name + " не прошел марафон");
    }
}
