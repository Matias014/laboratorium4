import java.util.Random;
import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {

        int a, b;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj a: ");
        a = input.nextInt();

        System.out.print("Podaj b: ");
        b = input.nextInt();

        if (b < a) {
            System.exit(0);
        } else {
            double x, y, z;
            x = rand.nextInt(a, b);
            y = rand.nextInt(a, b);
            z = rand.nextInt(a, b);

            System.out.println("Czy trojkat jest: " + czyTrojkat(x, y, z));
        }
    }

    public static boolean czyTrojkat(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a) ? true : false;
    }
}
