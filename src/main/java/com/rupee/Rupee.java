package com.rupee;

public class Rupee {

    private int rupeeValue;

    public Rupee(int rupeeValue) {
        this.rupeeValue = rupeeValue;
    }


    public int addRupees(Rupee twoRupee) {
        return rupeeValue + twoRupee.rupeeValue;
    }



    public int compareRupees(Rupee sevenRupee) {
        return rupeeValue;
    }
}
