package com.example.SpringBootJDBC.model;

import org.springframework.stereotype.Component;

@Component
public class Player {
    private int matches;
    private String name;
    private int runs;
    private int wickets;

    public Player(){

    }

    public Player(int matches, String name, int runs, int wickets) {
        this.matches = matches;
        this.name = name;
        this.runs = runs;
        this.wickets = wickets;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public String getName() {
        return name;
    }

    public void setName(String player) {
        this.name = player;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    @Override
    public String toString() {
        return "Player{" +
                "matches=" + matches +
                ", player='" + name + '\'' +
                ", runs=" + runs +
                ", wickets=" + wickets +
                '}';
    }
}
