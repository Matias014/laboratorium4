package Zadanie2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WprowadzZKonsoli {

    public static void main(String[] args) {

        int liczbaInt = wprowadzInt();
    }

    public static int wprowadzInt() {
        Scanner in = new Scanner(System.in);
        int liczba;

        while (true) {
            try {
                System.out.print("Podaj liczbe: ");
                liczba = in.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nieliczba => " + e.getMessage());
            }
        }

        return liczba;
    }

    public static char wprowadzChar() {
        Scanner in = new Scanner(System.in);
        char znak;

        while (true) {
            try {
                System.out.print("Podaj znak: ");
                znak = in.next().charAt(0);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error => " + e.getMessage());
            }
        }

        return znak;
    }
}
