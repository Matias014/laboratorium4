import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Podaj ilosc liczb do wczytania: ");
            n = input.nextInt();
        } while (n <= 0);

        int[] tablica = new int[n];

        for (int i = 0; i < n; i++) {
            tablica[i] = input.nextInt();
        }

        int suma = 0;

        for (int i = 0; i < n; i++) {
            if (tablica[i] % 2 == 0) {
                suma += tablica[i];
            }
        }

        System.out.println("Suma liczb parzystych: " + suma);
    }
}
