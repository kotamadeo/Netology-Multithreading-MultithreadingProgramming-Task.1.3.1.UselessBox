package com.gmail.at.kotamadeo.game;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Switcher {
    private final LocalDateTime localDateTime = LocalDateTime.now();
    private int counter;
    private volatile boolean isToggleOn;
    public void on(String name) {
        if (!isToggleOn) {
            System.out.printf("%s. %s включил переключатель - %d раз.%n",
                    localDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss - yy-M-dd")), name, ++counter);
            isToggleOn = true;
        }
    }
    public void off(String name) {
        if (isToggleOn) {
            System.out.printf("%s. %s выключил(а) переключатель.%n",
                    localDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss - yy-M-dd")), name);
            isToggleOn = false;
        }
    }
}
