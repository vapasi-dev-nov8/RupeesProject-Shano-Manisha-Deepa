package com.rupee;

public class Rupee {

    private int rupeeValue;

    public Rupee(int rupeeValue) {
        this.rupeeValue = rupeeValue;
    }

    public int addRupees(Rupee rupee) {
        return this.rupeeValue + rupee.rupeeValue;
    }

    public boolean compareRupees(Rupee rupee) {
        if (this.rupeeValue == rupee.rupeeValue)
            return true;
        return false;
    }
}
