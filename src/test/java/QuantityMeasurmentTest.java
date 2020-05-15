import com.bl.quantitymeasurment.QunatityMeasurment;
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
        double value1=qunatityMeasurment.getFeet(0.0);
        double value2=qunatityMeasurment.getFeet(0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenFeetValue_WhenNull_ThenShouldReturnFalse()
    {
       Assert.assertFalse(qunatityMeasurment.equals(null));
    }

    @Test
    public void givenRefrenceObject_WhenEqual_ThenShouldReturnTrue()
    {
       QunatityMeasurment qunatityMeasurment1=new QunatityMeasurment();
       Assert.assertEquals(qunatityMeasurment,qunatityMeasurment1);
    }

    @Test
    public void givenDiffrentTypeObject_WhenEqual_ThenShouldReturnFalse()
    {
        Object obj=new Object();
        Assert.assertFalse(qunatityMeasurment.equals(obj));
    }

    @Test
    public void givenTwoDiffrentFeetValue_WhenEqual_ThenShouldReturnFalse()
    {
        double value1=qunatityMeasurment.getFeet(0.0);
        double value2=qunatityMeasurment.getFeet(1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    @Test
    public void givenTwoEqualFeetValue_WhenEqual_ThenShouldReturnTrue()
    {
        double value1=qunatityMeasurment.getFeet(1.0);
        double value2=qunatityMeasurment.getFeet(1.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    @Test
    public void givenZeroInchAndZeroInchValue_WhenEqual_ThenShouldReturnTrue()
    {
        double value1=qunatityMeasurment.getInch(0.0);
        double value2=qunatityMeasurment.getInch(0.0);
        Assert.assertEquals(value1,value2,0.0);
    }


}
