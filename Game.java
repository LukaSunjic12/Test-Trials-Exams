package com.company;

import com.company.Dice;
public class Game {
    public Game(){
        Dice d = null;
        int counting = 0;
        do{
            d = new Dice();
            counting++;
        }while (d.getNumber() != 6);

        System.out.println("Created" + " " + counting + " " + "dices to get a 6");
    }
}
