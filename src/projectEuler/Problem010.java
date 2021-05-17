package projectEuler;

//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//        Find the sum of all the primes below two million.

public class Problem010 {

    public static boolean czyPierwsza(long liczba) {
        if (liczba < 2) {
            return false;
        }
        double max = Math.sqrt(liczba);
        for (long i = 2; i <= max; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {

        long suma = 0;

        for (int i = 2; i < 2000000; i++) {
            if (czyPierwsza(i)) {
                suma += i;
            }
        }

        System.out.println("suma = " + suma);

    }
}
