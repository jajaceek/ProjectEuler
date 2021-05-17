package projectEuler;

import java.util.Random;

public class MonteCarlo {
    public static void main(String[] args) {
        Random random = new Random();

        int amount = 10000000;
        int in = 0;

        for (int i = 0; i < amount; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            double distance = Math.hypot(x, y);

            if (distance <= 1) {
                in++;
            }
        }

        double pole = in/(double)amount;
        double pi = pole * 4;

        System.out.println("pole = " + pole);
        System.out.println("pi = " + pi);
    }
}
