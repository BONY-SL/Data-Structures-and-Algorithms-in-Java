package timecomplexity;

public class TimeComplexityDemo {
    public static void main(String[] args) {

        double now = System.currentTimeMillis();

        TimeComplexityDemo demo = new TimeComplexityDemo();
        System.out.println(demo.findSumTwo(99999));

        System.out.println("Time Taken - "+(System.currentTimeMillis() - now) + " millisecond");

    }


    public int findSumOne(int n){
        return n * (n+1) / 2;
    }

    public int findSumTwo(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum+i;
        }
        return sum;
    }
}
