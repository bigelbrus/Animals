package com.company;

public class Main {

    public static void main(String[] args) {

//        Animal[] animals = {new Cat("Barsik",2,40),new Dog("Sharik", 2,150,100), new Cat("Cat", 3,1)};

//        Obstacle[] obstacles = {new Wall(1), new Lake(50)};

        Team team = new Team("First",new Challengeable[]{new Cat("Barsik",2,40),new Dog("Sharik", 2,150,100), new Cat("Cat", 3,1)});
        Marathon marathon = new Marathon("Main", new Obstacle[]{new Wall(1), new Lake(50)});
        marathon.Game(team);
        team.info();
        }




}
