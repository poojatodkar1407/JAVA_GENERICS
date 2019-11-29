public class MaximumValue<T extends Comparable> {
    T value1;
    T value2;
    T value3;

    public MaximumValue(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public <T extends Comparable> T maxNumber() {

        T max = (T) value2;
        if (value1.compareTo(max) > 0) {
            max = (T) value1;
        } else if (value3.compareTo(max) > 0) {
            max = (T) value3;
        }

        return max;
    }
        private static <T > void printMaxValue (T maximumValue){
            System.out.println(maximumValue);
        }

        public static void main (String[]args){
        }


}
