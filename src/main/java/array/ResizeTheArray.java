package array;

import java.util.Arrays;

public class ResizeTheArray {
    public static void main(String[] args) {

        int[] arr = {20,10,4,5};

        System.out.println(arr.length);

        arr = ResizeTheArray.reSize(arr,20);

        System.out.println(arr.length);
    }

    public static int[] reSize(int[] array , int reSizeValue){

        int [] temp = new int[reSizeValue];

        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        //System.arraycopy(array, 0, temp, 0, array.length);
        return temp;
    }
}
