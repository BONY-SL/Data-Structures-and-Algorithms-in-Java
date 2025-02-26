package array;
public class FindMinValueInArray {
    public static void main(String[] args) {

        System.out.println("Minimum Value in Array : "+ FindMinValueInArray.getMinimumValueInArray(new int[]{56,44,3,21,9,2,54,67}));

    }

    public static int getMinimumValueInArray(int [] array){

        int min = array[0];

        for (int i = 1; i < array.length; i++) {

            if(array[i] < min)
                min = array[i];
        }

        return min;
    }
}
