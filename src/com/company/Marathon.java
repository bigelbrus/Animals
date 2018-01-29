package com.company;

public class Marathon {
    private String name;
    private Obstacle[] obstacles;

    public Marathon(String name, Obstacle[] obstacles) {
        this.name = name;
        this.obstacles = obstacles;
    }

    public void Game(Team team) {
        for (int i = 0; i < obstacles.length; i++) {
            System.out.println("Испытание №"+ (i+1)+ ": "  + obstacles[i].getType());
            for (int j = 0; j < team.getParticipants().length; j++) {
                if (team.getParticipants()[j].isOnDistance()) obstacles[i].doIt(team.getParticipants()[j]);
            }
        }
        System.out.println("Конец марафона.");
    }
}