public class MaximumValue {
    public static Integer maxNumber(Integer num1,Integer num2,Integer num3) {

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
        Integer num1 = 10;
        Integer num2 = 20;
        Integer num3 = 30;
        maxNumber(num1,num2,num3);
    }

}
