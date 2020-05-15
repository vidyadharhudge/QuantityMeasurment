import com.bl.quantitymeasurment.QunatityMeasurment;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurmentTest
{
    QunatityMeasurment qunatityMeasurment=null;

    @Before
    public void setup()
    {
        qunatityMeasurment=new QuantityMeasurment();
    }

    @Test
    public void givenZeroFeetAndZeroFeetValue_WhenEual_ThenShouldReturnTrue()
    {
        double value1=qunatityMeasurment.unitConversion(Units.FEET,0.0);
        double value2=qunatityMeasurment.unitConversion(Units.FEET,0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

}
