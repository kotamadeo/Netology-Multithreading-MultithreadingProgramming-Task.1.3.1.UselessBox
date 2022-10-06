package com.gmail.at.kotamadeo;

import com.gmail.at.kotamadeo.game.Switcher;
import com.gmail.at.kotamadeo.game.Toy;
import com.gmail.at.kotamadeo.game.User;
import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Thread user = new Thread(new User(switcher), "Игрок");
        Thread toy = new Thread(new Toy(switcher), "Котик");
        user.start();
        toy.start();
        user.join();
        toy.interrupt();
    }
}