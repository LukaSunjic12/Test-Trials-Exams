package com.company;

import java.util.ArrayList;

public class Playroom {
    private ArrayList<Toy> toys = new ArrayList<Toy>();

    public ArrayList<Toy> getToys() {
        return toys;}

    public void addToy(Toy toy){
        if (toy.getWeight() < 1000){
            toys.add(toy);
        }
    }
    public void average(){
        int weight = 0;
        for(Toy toy : toys){
            weight += toy.getWeight();
        }
        System.out.println(toys.size());
        System.out.println("Average weight:" + " " + weight / toys.size());
    }

}
