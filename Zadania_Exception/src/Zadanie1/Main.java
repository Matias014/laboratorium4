package Zadanie1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double liczba;

        while (true) {
            try {
                System.out.print("Podaj liczbe: ");
                liczba = in.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Please, give a proper number!");
                System.out.println(e);
                in.next();
            }
        }

        if (liczba < 0) {
            throw new IllegalArgumentException("Pierwiastek z " + liczba + " nie istnieje!");
        }

        System.out.println("Pierwiastek: " + Math.sqrt(liczba));
    }
}
