package com.company;

public class Team {
    private String name;
    private Challengeable[] challengeables;

    public Team (String name, Challengeable[] challengeables){
        this.name = name;
        this.challengeables = challengeables;
    }

    public Challengeable[] getParticipants(){
        return challengeables;
    }

    public void info(){
        System.out.println("Результат команды " + name + ":");
        for (Challengeable c: challengeables
             ) {
            c.getInfo();
        }
    }

}
