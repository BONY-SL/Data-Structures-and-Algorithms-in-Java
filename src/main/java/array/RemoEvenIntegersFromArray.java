package array;

import java.util.Arrays;

public class RemoEvenIntegersFromArray {

    public static void main(String[] args) {

        RemoEvenIntegersFromArray remoEvenIntegersFromArray = new RemoEvenIntegersFromArray();

        System.out.println(Arrays.toString(remoEvenIntegersFromArray.removeEven(new int[] {23, 31, 22, 4, 67, 89, 3})));

    }


    public int [] removeEven(int [] array){

        int oddCount = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                oddCount++;
            }
        }

        int [] oddArray = new int[oddCount];
        int index = 0;
        for (int j : array) {

            if (j % 2 != 0) {
                oddArray[index] = j;
                index++;
            }
        }

        return oddArray;
    }
}
