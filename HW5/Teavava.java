package com.cafe.menu;

public class Teavana extends Beverage{
    private int amount;

    public Teavana(String name) {
        this.name = name;
        this.basePrice = 4100;
        this.size = TALL;
        amount = TALL;
    }

    public boolean setSize(int size) {
        if(size!=GRANDE) {
            if (amount > size)
                basePrice -= 500;
            else if (amount < size)
                basePrice += 500;
            return super.setSize(size);
        }
        return false;
    }
}
