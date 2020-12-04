package projectEuler;

//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

public class Problem003 {


    public static void main(String[] args) {

        long liczba = 600851475143L;

        System.out.println(podajNajwiekszyCzynnikPierwszy(liczba));
    }

    public static boolean czyPierwsza(long liczba) {
        if (liczba < 1) return false;

        double max = Math.sqrt(liczba);
        for (long i = 2; i <= max; i++) {
            if (liczba % i == 0) return false;
        }
        return true;
    }


    public static long podajNajwiekszyCzynnikPierwszy(long liczba) {
        long pierwiastek = (long) Math.sqrt(liczba);
        long najwiekszyCzynnikPierwszy = 1;

        for (int i = 1; i <= pierwiastek; i++) {
            if (liczba % i == 0) {
                long drugiDzielnik = liczba / i;

                if (czyPierwsza(i)) {
                    if (i > najwiekszyCzynnikPierwszy)
                        najwiekszyCzynnikPierwszy = i;
                }

                if (czyPierwsza(drugiDzielnik)) {
                    if (drugiDzielnik > najwiekszyCzynnikPierwszy)
                        najwiekszyCzynnikPierwszy = drugiDzielnik;
                }
            }
        }
        return najwiekszyCzynnikPierwszy;
    }
}
