package com.bl.quantitymeasurment;

public enum Units {

    Inch(1/12.0),FEET(1*12.0);
    final Double unit;

    Units(Double unit) {
        this.unit = unit;
    }

}