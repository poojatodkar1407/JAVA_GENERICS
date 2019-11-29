import org.junit.Assert;
import org.junit.Test;

public class MaxmimumValueTest {

    @Test
    public void givenThreeIntegerValue_WhenProper_ReturnTrue() {
        Integer a = 1;
        Integer b = 7;
        Integer c = 8;
        MaximumValue<Integer> integerFindMaxNum = new MaximumValue<>(a, b, c);
        Comparable maxValue = integerFindMaxNum.maxNumber();
        Assert.assertEquals(8,maxValue);
    }

    @Test
    public void givenThreeFloatValue_WhenProper_ReturnTrue() {
        Float a = 1.5f;
        Float b = 7.8f;
        Float c = 8.5f;
        MaximumValue<Float> floatFindMaxNum = new MaximumValue<Float>(a, b, c);
        Comparable maxValue = floatFindMaxNum.maxNumber();
        Assert.assertEquals(8.5f,maxValue);
    }

    @Test
    public void givenThreeStringValue_WhenProper_ReturnTrue() {
        String a = "POOJA";
        String b = "xyz";
        String c = "mno";
        MaximumValue<String> stringFindMaxNum = new MaximumValue<String>(a, b, c);
        Comparable maxValue = stringFindMaxNum.maxNumber();
        Assert.assertEquals("Ram",maxValue);
    }
    @Test
    public void givenThreeIntegerValue_WhenProper_ReturnPrintThatValue() {
        Integer a = 10;
        Integer b = 20;
        Integer c = 30;
        MaximumValue<Integer> integerFindMaxNum = new MaximumValue<Integer>(a, b, c);
        Comparable maxValue = integerFindMaxNum.maxNumber();
        Assert.assertEquals(30,maxValue);
    }
}
