package com.example.myapp_5;

public class State {
    private String name;
    private String work;
    private int flagRes;

    public State(String name, String work, int flagRes){
        this.name = name;
        this.work = work;
        this.flagRes = flagRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getFlagRes() {
        return flagRes;
    }

    public void setFlagRes(int flagRes) {
        this.flagRes = flagRes;
    }
}
