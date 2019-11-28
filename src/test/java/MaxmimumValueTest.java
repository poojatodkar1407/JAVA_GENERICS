import org.junit.Assert;
import org.junit.Test;

public class MaxmimumValueTest {
    @Test
    public void maximumNumberInteger(){
        MaximumValue maximumNumber = new MaximumValue();
        Integer maxNumInteger = maximumNumber.maxNumber(10,20,30);
        Assert.assertEquals(30,maxNumInteger.intValue());
    }
}
