package com.cafe.menu;

public abstract class Beverage {
    public static final int TALL = 0;
    public static final int GRANDE = 1;
    public static final int VENTI = 2;

    String name; int basePrice; int size;

    public boolean setSize(String size) {
        if ("TALL".equals(size))
            return setSize(TALL);
        else if ("GRANDE".equals(size))
            return setSize(GRANDE);
        else if ("VENTI".equals(size))
            return setSize(VENTI);
        return false;
    }

    public boolean setSize(int size) {
        this.size = size;
        return true;
    }

    public String getName() {
        return name;
    }
    public int getprice() {
        return basePrice;
    }
    public String getsize() {
        String s = new String();
        if(size == TALL)
            s += "TALL";
        else if(size == GRANDE)
            s += "GRANDE";
        else if (size == VENTI)
            s += "VENTI";
        return s;
    }
}
