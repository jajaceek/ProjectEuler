package projectEuler;

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Problem005 {
    public static void main(String[] args) {
        System.out.println(smallestNumber(2147483647));
    }

    public static long smallestNumber(long number) {
        long result = Integer.MAX_VALUE;
        boolean flag = true;
        for (long i = number; i > 0; i--) {
            flag = true;
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0 && flag) {
                    if (j == 20) {
                        result = i;
                    }
                } else flag = false;
            }
        }

        return result;
    }
}
