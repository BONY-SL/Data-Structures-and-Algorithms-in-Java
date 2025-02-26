package array;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseArray(new int[]{2,11,5,10,7,8})));

    }

    public static int [] reverseArray(int [] array){

        int startIndex = 0;
        int endIndex = array.length-1;

        while (startIndex < endIndex){
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

        return array;

    }

}
