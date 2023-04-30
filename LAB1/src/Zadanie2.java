import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args, int wiek) {

        Scanner input = new Scanner(System.in);

        int x, y;

        x = input.nextInt();
        y = input.nextInt();

        obliczenia(x, y);
    }

    public static void obliczenia(int a, int b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Roznica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }
}
