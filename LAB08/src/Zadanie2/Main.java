package Zadanie2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws BlednaWartoscDlaSilniException {

        Scanner in = new Scanner(System.in);
        int n;

        while (true) {
            try {
                System.out.print("Podaj n: ");
                n = in.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error => " + e.getMessage());
                in.next();
            }
        }

        System.out.println(n + "! = " + silnia(n));
    }

    public static int silnia(int n) throws BlednaWartoscDlaSilniException {
        if (n < 0) {
            throw new BlednaWartoscDlaSilniException("Nie mozna liczyc silnie z liczby mniejszej niz zero!");
        }

        int  temp = 1;

        for (int i = 2; i <= n; i++) {
            temp *= i;
        }

        return temp;
    }
}
