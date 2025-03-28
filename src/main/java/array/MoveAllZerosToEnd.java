package array;

import java.util.Arrays;
import java.util.logging.Logger;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {

        int[] numbers = {34, 0, 22, 1, 0, 10, 0, 0, 60, 4, 0};

        Logger logger = Logger.getLogger(MoveAllZerosToEnd.class.getName());

        int [] resultArray = MoveAllZerosToEnd.moveAllZerosToEndOfArray(numbers);

        logger.info(()-> "Initial Array : " + Arrays.toString(numbers));
        logger.info(()-> "Result Array : " + Arrays.toString(resultArray));

    }

    public static int [] moveAllZerosToEndOfArray(int [] array){

        int j = 0; // j for the zeroth elements
        for (int i = 0; i < array.length; i++) { // i for the non zeroth elements
            if(array[i] != 0 && array[j] == 0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if(array[j] != 0){
                j++;
            }
        }
        return array;
    }
}
