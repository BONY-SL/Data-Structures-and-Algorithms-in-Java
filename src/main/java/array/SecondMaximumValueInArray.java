package array;

import java.util.logging.Logger;

public class SecondMaximumValueInArray {

    public static void main(String[] args) {

        int[] numbers = {34, 43, 22, 1, 38, 10, 11, 21};

        Logger logger = Logger.getLogger(SecondMaximumValueInArray.class.getName());

        int secondMaxValue = SecondMaximumValueInArray.returnSecondMaxValue(numbers);
        logger.info(()-> String.format("Second Max Value is : %d" , secondMaxValue));

    }

    public static int returnSecondMaxValue(int [] array){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int j : array) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }
        }
        return secondMax;

    }
}
