package com.welley.dice;

import java.util.HashSet;
import java.util.Set;

public class Player {
    private final Set<Integer> win = new HashSet<>();
    private final Set<Integer> lose = new HashSet<>();
    private String name, state, message;
    private int sum, pointRoll, dice1Rolled, dice2Rolled;

    public Player() {
        this.name = "You";
        this.state = "start";
        this.pointRoll = 0;
    }

    public String setGameConditions() {
        this.win.add(7);
        this.win.add(11);
        this.lose.add(2);
        this.lose.add(3);
        this.lose.add(12);
        return "Natural wins = " + this.win + " & Crap rolls = " + this.lose;
    }

    public String rollDice() {
        if (this.state == "start") {
            Dice diceSet = new Dice();
            dice1Rolled = diceSet.dice1;
            dice2Rolled = diceSet.dice2;
            this.sum = dice1Rolled + dice2Rolled;
            System.out.println(Player.this.name + " rolled " + diceSet.dice1 + " and " + diceSet.dice2 + " (" + sum + ")");
            this.state = setState();
        }
        else {
            Dice diceSet = new Dice();
            dice1Rolled = diceSet.dice1;
            dice2Rolled = diceSet.dice2;
            this.sum = dice1Rolled + dice2Rolled;
            System.out.println(Player.this.name + " rolled " + diceSet.dice1 + " and " + diceSet.dice2 + " (" + sum + ")");
            this.state = setSecondState();
        }
        return dice1Rolled + " and " + dice2Rolled + " (" + sum + ")";
    }

    public String setState(){
        if (this.win.contains(this.sum)) {
            this.state = "win";
        }
        else if (this.lose.contains(this.sum)) {
            this.state = "lose";
        }
        else {
            this.state = "reroll";
            this.pointRoll = this.sum;
        }
            checkWinLoseContinue();
        return state;
    }

    public String setSecondState(){
        if (this.sum == this.pointRoll) {
            this.state = "win";
        }
        else if (this.sum == 7) {
            this.state = "lose";
        }
        else {
            this.state = "reroll";
        }
        checkWinLoseContinue();
        return state;
    }

    public String checkWinLoseContinue(){
        if (state =="win"){
            message = "You win! Restarting...";
            this.state = "start";
            this.pointRoll = 0;
        }
        else if (state == "lose"){
            message = "You lost :( Restarting...";
            this.state = "start";
            this.pointRoll = 0;
        }
        else if (state == "reroll") {
            message = "You can roll again!\nPOINT is " + this.pointRoll;
            this.state = "reroll";
        }
        return message;
    }

}
