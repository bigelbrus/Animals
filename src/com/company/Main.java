package com.company;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] =  new Cat("Barsik",2,40);
        animals[1] =  new Dog("Sharik", 2,150,100);
        animals[2] = new Cat("Cat", 3,1);

        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new Wall(1);
        obstacles[1] = new Lake(50);
        Team team = new Team("First",animals);
        Marathon marathon = new Marathon("Main", obstacles);
        marathon.Game(team);
        team.info();
        }




}
