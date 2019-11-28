import org.junit.Assert;
import org.junit.Test;

public class MaxmimumValueTest {


    @Test
    public void maximumNumberFloat(){
        MaximumValue maximumNumber = new MaximumValue();
        String maxNumInteger = maximumNumber.maxNumber("abc","xyz","mno");
        Assert.assertEquals("xyz",maxNumInteger);
    }
}
