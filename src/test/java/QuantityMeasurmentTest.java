import com.bl.quantitymeasurment.QunatityMeasurment;
import com.bl.quantitymeasurment.Units;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurmentTest
{
    QunatityMeasurment qunatityMeasurment;

    @Before
    public void setup()
    {
        qunatityMeasurment=new QunatityMeasurment();
    }

    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEqual_ThenShouldReturnTrue()
    {
        double value1=qunatityMeasurment.unitConversion(Units.FEET,0.0);
        double value2=qunatityMeasurment.unitConversion(Units.FEET,0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenFeetValue_WhenNull_ThenShouldReturnFalse()
    {
       Assert.assertFalse(qunatityMeasurment.equals(null));
    }

    @Test
    public void givenRefrenceObjectForFeet_WhenEqual_ThenShouldReturnTrue()
    {
       QunatityMeasurment qunatityMeasurment1=new QunatityMeasurment();
       Assert.assertEquals(qunatityMeasurment,qunatityMeasurment1);
    }

    @Test
    public void givenDiffrentTypeCheckObject_WhenEqual_ThenShouldReturnFalse()
    {
        Object obj=new Object();
        Assert.assertFalse(qunatityMeasurment.equals(obj));
    }

    @Test
    public void givenTwoDiffrentFeetValue_WhenEqual_ThenShouldReturnFalse()
    {
        double value1=qunatityMeasurment.unitConversion(Units.FEET,0.0);
        double value2=qunatityMeasurment.unitConversion(Units.FEET,1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    @Test
    public void givenTwoEqualFeetValue_WhenEqual_ThenShouldReturnTrue()
    {
        double value1=qunatityMeasurment.unitConversion(Units.FEET,1.0);
        double value2=qunatityMeasurment.unitConversion(Units.FEET,1.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ThenShouldReturnTrue()
    {
        double value1=qunatityMeasurment.unitConversion(Units.INCH,0.0);
        double value2=qunatityMeasurment.unitConversion(Units.INCH,0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenInchValue_WhenNull_ThenShouldReturnFals()
    {
        Assert.assertFalse(qunatityMeasurment.equals(null));
    }

    @Test
    public void givenRefrenceObjectForInch_WhenEqual_ThenShouldReturnTrue()
    {
        QunatityMeasurment qunatityMeasurment1=new QunatityMeasurment();
        Assert.assertEquals(qunatityMeasurment,qunatityMeasurment1);
    }

    @Test
    public void givenDiffrentTypeCheckObjectInch_WhenEqual_ThenShouldReturnFalse()
    {
        Object obj=new Object();
        Assert.assertFalse(qunatityMeasurment.equals(obj));
    }

    @Test
    public void givenTwoEqualInchValue_WhenEqual_ThenShouldReturnTrue()
    {
        double value1=qunatityMeasurment.unitConversion(Units.INCH,1.0);
        double value2=qunatityMeasurment.unitConversion(Units.INCH,1.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenTwoDiffrentInchValue_WhenEqual_ThenShouldReturnFalse()
    {
        double value1=qunatityMeasurment.unitConversion(Units.INCH,0.0);
        double value2=qunatityMeasurment.unitConversion(Units.INCH,1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    @Test
    public void givenOneFeetAndOneInchValue_WhenNotEqual_ThenShouldReturnTrue()
    {
        double feetValue=qunatityMeasurment.unitConversion(Units.FEET,1.0);
        double inchValue=qunatityMeasurment.unitConversion(Units.INCH,1.0);
        Assert.assertNotEquals(feetValue,inchValue,0.0);
    }

    @Test
    public void givenOneInchAndOneFeetValue_WhenNotEqual_ThenShouldReturnTrue()
    {
        double inchValue=qunatityMeasurment.unitConversion(Units.INCH,1.0);
        double feetValue=qunatityMeasurment.unitConversion(Units.FEET,1.0);
        Assert.assertNotEquals(inchValue,feetValue,0.0);
    }

    @Test
    public void givenOneFeetAndTweleveInchValue_WhenEqual_ThenShouldReturnTrue()
    {
        double feetValue=qunatityMeasurment.unitConversion(Units.FEET,1.0);
        double inchValue=qunatityMeasurment.unitConversion(Units.INCH,12.0);
        Assert.assertEquals(feetValue,inchValue,0.0);
    }

    @Test
    public void givenTweleveInchAndOneFeetValue_WhenEqual_ThenShouldReturnTrue()
    {
        double inchValue=qunatityMeasurment.unitConversion(Units.INCH,12.0);
        double feetValue=qunatityMeasurment.unitConversion(Units.FEET,1.0);
        Assert.assertEquals(inchValue,feetValue,0.0);
    }

    @Test
    public void givenThreeFeetAndOneYardValue_WhenEqual_ThenShouldReturnTrue()
    {
        double feetValue=qunatityMeasurment.unitConversion(Units.FEET,3.0);
        double yardValue=qunatityMeasurment.unitConversion(Units.YARD,1.0);
        Assert.assertEquals(yardValue,feetValue,0.0);
    }
    @Test
    public void givenOneFeetAndOneYardValue_WhenNotEqual_ThenShouldReturnTrue()
    {
        double feetValue=qunatityMeasurment.unitConversion(Units.FEET,1.0);
        double yardValue=qunatityMeasurment.unitConversion(Units.YARD,1.0);
        Assert.assertNotEquals(yardValue,feetValue,0.0);
    }


}
