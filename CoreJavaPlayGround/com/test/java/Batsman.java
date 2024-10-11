package com.test.java;

public class Batsman implements Comparable<Batsman>{
    private int matches;
    private int runs;
    private String name;

    public Batsman(int matches, int runs, String name) {
        this.matches = matches;
        this.runs = runs;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Batsman{" +
                "matches=" + matches +
                ", runs=" + runs +
                ", name='" + name + '\'' +
                '}';
    }

    public String introduce() {
        return "I am "+name +" . I have played "+matches+ " matches and scored "+runs;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Batsman that) {
        if(this.getRuns()/this.getMatches()>that.getRuns()/that.getMatches()){
            return 1;
        }else{
            return -1;
        }
    }
}
