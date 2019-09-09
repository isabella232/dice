package com.welley.dice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    private Player player = new Player();
    private String displayConditions;

    @GetMapping("/game")
    public String runGame(Model model) {
        System.out.println("Welcome to a game of CRAPS!");
        displayConditions = player.setGameConditions();
        model.addAttribute("displayConditions", displayConditions);
        return "game";
    }

    @GetMapping("/button")
    public String roll(Model model) {
        String diceNumbers = player.rollDice();
        String displayMessage = player.checkWinLoseContinue();
        model.addAttribute("displayMessage", displayMessage);
        model.addAttribute("displayConditions", displayConditions);
        model.addAttribute("diceNumbers", diceNumbers);
        return "game";
    }




}
