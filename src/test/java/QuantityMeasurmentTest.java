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


}
