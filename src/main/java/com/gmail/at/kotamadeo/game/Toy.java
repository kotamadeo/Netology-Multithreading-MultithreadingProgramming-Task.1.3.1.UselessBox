package com.gmail.at.kotamadeo.game;

import lombok.AllArgsConstructor;

import static java.lang.Thread.currentThread;

@AllArgsConstructor
public class Toy implements Runnable{
    private final Switcher switcher;

    @Override
    public void run() {
        while (!currentThread().isInterrupted()) {
            switcher.off(currentThread().getName());
        }
        System.out.println("Поставьте пожалуйста, игрушку на зарядку...");
    }
}
