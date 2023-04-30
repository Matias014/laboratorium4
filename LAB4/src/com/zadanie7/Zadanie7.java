package com.zadanie7;

import java.util.Arrays;

public class Zadanie7 {

    public static void main(String[] args) {

        String[] tablica1 = { "jeden", "dwa", "trzy" };
        String[] tablica2 = { "jeden", "dwa", "trzy" };

        System.out.println("Czy takie same: " + czyTakieSame(tablica1, tablica2));
    }

    public static boolean czyTakieSame(String[] array1, String[] array2) {
        boolean czyTakieSame = true;

        if (array1.length != array2.length) {
            czyTakieSame = false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (czyTakieSame == false) {
                break;
            }

            if (array1[i] != array2[i]) {
                czyTakieSame = false;
            }
        }

        return czyTakieSame;
    }
}
