package com.company;

import java.util.Random;

public class Dice {
    private int number;
    private Random rand = new Random();
    public Dice() {
        number = rand.nextInt(6) + 1;
        System.out.println(number);
    }


    public int getNumber() {
        return number;}

    public void setNumber(int number) {
        this.number = number;}
}
