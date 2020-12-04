package projectEuler;

/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/


public class Problem004 {

    public static boolean czyPanlindrom(String text) {
        for (int i = 0; i < text.length() / 2; i++) {
            char znak = text.charAt(i);
            char przeciwnyZnak = text.charAt(text.length() - 1 - i);
            if (znak != przeciwnyZnak) return false;
        }
        return true;
    }

    public static boolean czyPanlindrom(int liczba) {
        return czyPanlindrom(Long.toString(liczba));
    }


    public static void main(String[] args) {
        int result = 0;
        int temp;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                temp = i * j;
                if (czyPanlindrom(temp)) {
                    if (temp > result) result = temp;
                }
            }
        }
        System.out.println(result);
    }
}
