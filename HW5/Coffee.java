package com.cafe.menu;

public class Coffee extends Beverage {
    private int defaultShot;

    public Coffee (String name) {
        this.name = name;
        this.basePrice = 4100;
        this.size = TALL;
        defaultShot = TALL;
    }

    public boolean setSize(int size) {
        this.size = size;
        if (size > defaultShot)
            basePrice += 500;
        else if (size < defaultShot)
            basePrice -= 500;
        return true;
    }
}
