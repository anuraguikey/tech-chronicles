package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run(){
        System.out.println(
                "Game is running"
        );
        game.name();
        game.up();
        game.down();
        game.left();
        game.right();
    }




}
