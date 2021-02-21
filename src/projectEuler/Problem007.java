package projectEuler;

//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?


public class Problem007 {

    public static void main(String[] args) {
        long liczba = 0;
        long licznik = 0;

        while (licznik < 10001) {
            liczba++;
            if (czyPierwsza(liczba)) {
                licznik++;
            }
        }
        System.out.println("liczba: " + liczba);
    }


    public static boolean czyPierwsza(long liczba) {
        if (liczba < 2) return false;

        double max = Math.sqrt(liczba);
        for (long i = 2; i <= max; i++) {
            if (liczba % i == 0) return false;
        }
        return true;
    }

}
