package com.gmail.at.kotamadeo.game;

import lombok.AllArgsConstructor;

import java.util.Random;

import static java.lang.Thread.currentThread;
import static java.util.concurrent.TimeUnit.SECONDS;

@AllArgsConstructor
public class User implements Runnable {
    private final Switcher switcher;
    private static final int SWITCHES_AMOUNT = 20;
    private static final int RANDOM_TIME_TO_SWITCH = 5;

    @Override
    public void run() {
        for (int i = 0; i < SWITCHES_AMOUNT; i++) {
            try {
                switcher.on(currentThread().getName());
                SECONDS.sleep(new Random().nextInt(RANDOM_TIME_TO_SWITCH));
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
