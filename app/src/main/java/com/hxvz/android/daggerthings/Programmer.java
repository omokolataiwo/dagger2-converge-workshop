package com.hxvz.android.daggerthings;

import javax.inject.Inject;

public class Programmer implements Profession {
    @Inject
    public Programmer() {}
    public String work() {
        return "Working as a programmer!";
    }

    public String play() {
        return "I love this console game.";
    }
}
