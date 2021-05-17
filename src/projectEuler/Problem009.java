package projectEuler;

//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//        a2 + b2 = c2
//        For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//        There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//        Find the product abc.


public class Problem009 {

    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++) {
            for (int b = 1; b < 1000; b++) {
                int c = 1000 - a - b;

                if (a * a + b * b == c * c) {
                    System.out.println("Rozwiązanie: ");
                    System.out.println("a = " + a);
                    System.out.println("b = " + b);
                    System.out.println("c = " + c);

                    System.out.println("Rezultat: " + a * b * c);
                }

            }
        }
    }
}
