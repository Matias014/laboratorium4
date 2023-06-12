package Zadanie5;

import java.util.Random;

public class Main {

    public static int ileWystapien = 0;

    public static void main(String[] args) {

        if (ileWystapien == 3) {
            System.exit(0);
        }

        Random rand = new Random();
        int liczba = rand.nextInt(21) - 10;
        int drugaLiczba = rand.nextInt(21) - 10;

        try {
            System.out.println("Iloraz: " + liczba / drugaLiczba);
        } catch (ArithmeticException e) {
            System.out.println("Nie mozna dzielic przez zero => " + e.getMessage());
            ileWystapien++;
        }
    }
}
