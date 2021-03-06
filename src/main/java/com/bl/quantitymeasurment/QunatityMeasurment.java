/* *********************************************************************************************************
 * @purpose;-QuantityMeasurement Class Used For Return The Converted Value And Also For Comparsion Of Value
 * @Author;-vidyadhar
 * @Date:-16/05/2020
 * *********************************************************************************************************/

package com.bl.quantitymeasurment;
import com.bl.quantitymeasurment.enums.Units;
import com.bl.quantitymeasurment.exception.QuantityMeasurmentException;
public class QunatityMeasurment {

    /*
    * @purpose:-Calculating Conversion
    * @param units:-Taking The Unit In Which Value To Be Convertd
    * @param value:-Taking The Value Which We Need To Convert
    * @return:-Converted Value
    */
    public double unitConversion(Units units, double value) {
        if (value < 0) {
               throw new QuantityMeasurmentException(QuantityMeasurmentException.ExceptionType.ENTER_VALID_INPUT, "Value Should Be poistive");
        }else {
            return value * units.unit;
        }
    }

    /*
    * @purpose:-Use For Comparision
    * @param obj:-Use For Comparision For Null,Reference,Etc
    * @return:-Return The Result Its True Or False(obj)
    */
    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (this==obj)return true;
        if (this.getClass()==obj.getClass())return true;
        return super.equals(obj);
    }
}
