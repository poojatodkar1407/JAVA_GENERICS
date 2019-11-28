import org.junit.Assert;
import org.junit.Test;

public class MaxmimumValueTest {


    @Test
    public void maximumNumberFloat(){
        MaximumValue maximumNumber = new MaximumValue();
        Double maxNumInteger = maximumNumber.maxNumber(10.10,20.20,30.30);
        Assert.assertEquals(30,maxNumInteger.intValue());
    }
}
