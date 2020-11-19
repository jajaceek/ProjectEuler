package euler.problem2;

public class Problem2 {

    public static void main(String[] args) {
        long poprzednia2 = 1;
        long poprzednia1 = 2;
        long fibonacci = poprzednia2 + poprzednia1;
        long suma = 2;

        while (fibonacci < 4000000) {
            if (fibonacci % 2 == 0) {
                suma += fibonacci;
            }

            poprzednia2 = poprzednia1;
            poprzednia1 = fibonacci;
            fibonacci = poprzednia1 + poprzednia2;
        }

        System.out.println("suma = " + suma);
    }
}
