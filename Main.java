package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Toy toy = new Toy("Snoopy",45);
        Toy toy1 = new Toy("Robot",1002);
        Toy toy2 = new Toy("Rex",75);

        Playroom playroom = new Playroom();
        playroom.addToy(toy);
        playroom.addToy(toy1);
        playroom.addToy(toy2);

        playroom.average();
    }
}
