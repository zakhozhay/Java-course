package com.zoi;

import javax.print.MultiDocPrintService;

public class Player {
    String name;
    byte age;
    double force;

    public Player(byte age, double force) {
        this.age = age;
        this.force = force;
        this.name = this.toString();
    }
    public  Player() {}

    void push() {
        force -= age/100;
    }

    void pass() {
        System.out.println("Ну і навіщо тоді гру запускав?)))");
    }

}
