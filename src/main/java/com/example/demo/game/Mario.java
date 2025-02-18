package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class Mario implements GamingConsole{
    public static final String GAME_NAME = "MARIO";
    @Override
    public void name() {
        System.out.println( GAME_NAME);
    }

    @Override
    public void up() {
        System.out.println("Mario up");
    }

    @Override
    public void down() {
        System.out.println("Mario down");
    }

    @Override
    public void left() {
        System.out.println("Mario left");
    }

    @Override
    public void right() {
        System.out.println("Mario right");
    }
}
