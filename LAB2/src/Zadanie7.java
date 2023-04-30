import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Ile chcesz liczb podac: ");
        n = input.nextInt();

        if (n <= 0) {
            System.out.println("Tak nie mozna!");
            System.exit(0);
        } else {
            int[] tablica = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + ": ");
                tablica[i] = input.nextInt();
            }

            System.out.println("Sortuje...");

            int temp;

            for (int i = 0; i < n - 1; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    temp = tablica[i + 1];
                    tablica[i + 1] = tablica[i];
                    tablica[i] = temp;
                }
            }

            System.out.println("Po sortowaniu...");

            for (int i = 0; i < n; i++) {
                System.out.println(tablica[i]);
            }
        }
    }
}
