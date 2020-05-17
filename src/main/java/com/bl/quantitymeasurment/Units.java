package com.bl.quantitymeasurment;

public enum Units
{
    //Enum For Conversion According To Length
    INCH(1.0),FEET_TO_INCH(1*12.0),YARD_TO_INCH(1*36.0),CM_TO_INCH(1/2.5),
    //Enum For Conversion According To Volume
    LITRE(1.0),GALLON_TO_LITRE(1*3.78),MILLILITER_TO_LITRE(1.0/1000),
    //Enum For Conversion According To Weight
    KG(1.0),GRAMS_TO_KG(1.0/1000),TONNE_TO_KG(1.0*1000),
    //Enum For Conversion According To Temprature
    CELSIUS(1.0*2.12),FAHRENHEIT_TO_CELSIUS(1.0);

    final Double unit;
    Units(Double unit)
    {
        this.unit = unit;
    }

}