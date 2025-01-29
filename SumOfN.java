public class SumOfN {
    public static void main(String[] args) {
        double startTime = System.currentTimeMillis();
        SumOfN demo = new SumOfN();
        System.out.println(demo.findSumMath(99999999));
        // System.out.println(demo.findSumLoop(99999999));
        System.out.println("Time Taken: " + (System.currentTimeMillis() - startTime)+ " millis");
    }

    public int findSumMath(int n) {
        return n * (n + 1) / 2;
    }

    public int findSumLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
