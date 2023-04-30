import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        
        double a, b, c, delta, x_1, x_2;
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj a: ");
        a = input.nextDouble();

        if (a == 0) {
            System.out.println("To nie jest rownanie kwadratowe!");
            System.exit(0);
        } else {
            System.out.print("Podaj b: ");
            b = input.nextDouble();

            System.out.print("Podaj c: ");
            c = input.nextDouble();

            delta = Math.pow(b, 2) - (4 * a * c);

            if (delta > 0) {
                x_1 = (-b - Math.sqrt(delta)) / (2 * a);
                x_2 = (-b + Math.sqrt(delta)) / (2 * a);

                System.out.println("Delta: " + delta);
                System.out.println("x_1: " + x_1);
                System.out.println("x_2: " + x_2);
            } else if (delta == 0) {
                x_1 = (-b) / (2 * a);

                System.out.println("Delta: " + delta);
                System.out.println("x_0: " + x_1);
            } else {
                System.out.println("Delta: " + delta);
                System.out.println("Nie ma pierwiastkow!");
            }
        }

        System.out.println("Koniec programu!");
    }
}
