package com.bl.quantitymeasurment;

import java.util.Objects;

public class QunatityMeasurment
{
    private double feet;
    private double Inch;

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

    public double getInch(double Inch )
    {
        return Inch;
    }
}
