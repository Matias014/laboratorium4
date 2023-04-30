import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        boolean dziala = true;
        double[] tablica = new double[10];
        Scanner input = new Scanner(System.in);
        int wybor_uzytkownika;

        System.out.println("Wprowadz 10 liczb do tablicy\n");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ": ");
            tablica[i] = input.nextDouble();
        }

        do {
            System.out.println("---------------------------------");
            System.out.println("1 Wyswietlanie tablicy od pierwszego do ostatniego indeksu");
            System.out.println("2 Wyswietlanie tablicy od ostatniego do pierwszego indeksu");
            System.out.println("3 Wyswietlanie elementow o nieparzystych indeksach");
            System.out.println("4 Wyswietlanie elementow o parzystych indeksach");
            System.out.println("5 Wyjdz");
            System.out.print("Wybor: ");
            wybor_uzytkownika = input.nextInt();
            System.out.println("---------------------------------");

            if (wybor_uzytkownika == 1) {
                for (int i = 0; i < 10; i++) {
                    System.out.print(tablica[i] + ", ");
                }
            } else if (wybor_uzytkownika == 2) {
                for (int i = 9; i >=0; i--) {
                    System.out.print(tablica[i] + ", ");
                }
            } else if (wybor_uzytkownika == 3) {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 1) {
                        System.out.print(tablica[i] + ", ");
                    }
                }
            } else if (wybor_uzytkownika == 4) {
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        System.out.print(tablica[i] + ", ");
                    }
                }
            } else if (wybor_uzytkownika == 5) {
                System.out.println("Wychodze...");
                dziala = false;
            } else {
                System.out.println("Nieznana ocpja. Wychodze...");
                dziala = false;
            }
            System.out.println("\n---------------------------------");
        } while (dziala);

        System.out.println("Koniec programu...");
    }
}
