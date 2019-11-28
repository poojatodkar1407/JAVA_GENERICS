public class MaximumValue {
    public static String maxNumber(String num1,String num2,String num3) {

        if(num1.compareTo(num2) > 0) {
            return num1;
        }
        else if( num3.compareTo(num2) > 0){
            return num3;
        }
        else {
            return num2;
        }

    }

    public static void main(String[] args) {
        String num1 = "abc";
        String num2 = "xyz";
        String num3 = "mno";
        maxNumber(num1,num2,num3);
    }

}
