package com.company;

public class Cat extends Animal{

    public Cat(String name, int maxJump, int maxRun) {
        super(name, "Cat", maxJump, maxRun, 0);
    }

    @Override
    public void swim(int swim) {
        System.out.println("Кот " + name + " сходит с дистанции, коты не плавают");
        onDistance = false;
    }
}
