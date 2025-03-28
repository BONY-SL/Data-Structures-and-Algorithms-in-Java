package array;

public class FindMissingNumberInArray  {
    public static void main(String[] args) {
        // The Sum of n natural numbers = n * (n+1) /2

        int [] array = {2,4,1,8,6,3,7};

        int n = array.length+1;
        int sum = n*(n+1)/2;

        for (int num : array){
            sum = sum - num;
        }

        System.out.println(sum);
    }
}
