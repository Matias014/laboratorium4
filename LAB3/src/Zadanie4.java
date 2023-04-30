import java.util.Random;
import java.util.Scanner;

public class Zadanie4 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ile liczb chcesz wylosowac: ");
            n = input.nextInt();
        } while (n <= 0);

        int[] tablica = new int[n];

        for (int i = 0; i < n; i++) {
            tablica[i] = rand.nextInt(56) - 10;
            System.out.println(tablica[i]);
        }

        int suma = 0;

        for (int i = 0; i < n; i++) {
            if (tablica[i] % 2 == 0) {
                suma += tablica[i];
            }
        }

        System.out.println("Suma wszystkich parzystych liczb: " + suma);
    }
}
