package com.company;

public class RacingCar extends Car {
    private String team;
    private int number;
    private int horsePower;

    @Override
    public void drive() {
        System.out.println("Ich fahre schnell.");
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
