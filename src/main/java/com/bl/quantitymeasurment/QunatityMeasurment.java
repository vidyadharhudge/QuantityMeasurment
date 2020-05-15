package com.bl.quantitymeasurment;

import java.util.Objects;

public class QunatityMeasurment
{
    private double feet;

    public double getFeet(double feet)
    {
        return feet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QunatityMeasurment that = (QunatityMeasurment) o;
        return Double.compare(that.feet, feet) == 0;
    }
}
