public class MaximumValue {
    public static Double maxNumber(Double num1,Double num2,Double num3) {

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
        Double num1 = 10.10;
        Double num2 = 20.20;
        Double num3 = 30.30;
        maxNumber(num1,num2,num3);
    }

}
