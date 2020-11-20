package euler.problem2;

public class Problem1 {

    public static void main(String[] args) {
        System.out.println(multiple(1000));
    }

    private static long multiple(int n) {
        long sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
