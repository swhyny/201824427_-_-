package com.cafe.menu;

public class Blended extends Beverage{
    private int baseAmount;

    public Blended(String name) {
        this.name = name;
        this.basePrice = 6800;
        this.size = GRANDE;
        baseAmount = GRANDE;
    }

    public boolean setSize(int size) {
        if(size >= GRANDE) {
            if (size > baseAmount)
                baseAmount += 500;
            return super.setSize(size);
        }
        return false;
    }
}
