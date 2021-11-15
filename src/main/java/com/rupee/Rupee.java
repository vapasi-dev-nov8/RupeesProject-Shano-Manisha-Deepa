package com.rupee;

import java.util.Objects;

public class Rupee {

    private int rupeeValue;

    public Rupee(int rupeeValue) {
        this.rupeeValue = rupeeValue;
    }

    public Rupee add(Rupee rupee) {
        return new Rupee(this.rupeeValue + rupee.rupeeValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rupee rupee = (Rupee) o;
        return rupeeValue == rupee.rupeeValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rupeeValue);
    }

    /*public boolean compareRupees(Rupee rupee) {
        if (this.rupeeValue == rupee.rupeeValue)
            return true;
        return false;
    }*/

}
