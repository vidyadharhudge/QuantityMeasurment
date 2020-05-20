/* *********************************************************************************************************
 * @purpose;-enum Units Used For Conversion Of Different Unit
 * @Author;-vidyadhar
 * @Date:-16/05/2020
 * *********************************************************************************************************/
package com.bl.quantitymeasurment.enums;
public enum  Units
{
    //Enum For Conversion According To Length
    INCH(1.0),FEET_TO_INCH(1*12.0),YARD_TO_INCH(1*36.0),CM_TO_INCH(1/2.5),

    //Enum For Conversion According To Volume
    LITRE(1.0),GALLON_TO_LITRE(1*3.78),MILLILITER_TO_LITRE(1.0/1000),

    //Enum For Conversion According To Weight
    KG(1.0),GRAMS_TO_KG(1.0/1000),TONNE_TO_KG(1.0*1000),

    //Enum For Conversion According To Temperature
    CELSIUS(1.0*2.12),FAHRENHEIT_TO_CELSIUS(1.0);

    public final Double unit;

    /*
    * @purpose:-Store The Conversion Value
    * @param unit:-Taking Value As Parameter For Specific Unit (unit)
    */
    Units(Double unit) {
        this.unit = unit;
    }
}
