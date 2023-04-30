import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Podaj liczbe studentow: ");
            n = input.nextInt();
        } while (n < 0);

        int[] punkty = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbe punktow: ");
            punkty[i] = input.nextInt();
        }

        int k = 0;
        double suma = 0;

        while (k < n) {
            suma += punkty[k];
            k++;
        }

        double srednia = suma / n;
        System.out.println("Srednia ilosc pkt.: " + srednia);
    }
}
