package projectEuler;

//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Problem006 {

    public static void main(String[] args) {
        int n = 100;
        System.out.println(differenceSumOfSquaresAndSquareOfSum(n));
        System.out.println(sumOfSquares(n));
        System.out.println(squareOfSum(n));

    }

    public static int sumOfSquares(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i * i;
        }
        return result;
    }

    public static int squareOfSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result * result;
    }

    public static int differenceSumOfSquaresAndSquareOfSum(int n) {
        return squareOfSum(n) - sumOfSquares(n);
    }

}
