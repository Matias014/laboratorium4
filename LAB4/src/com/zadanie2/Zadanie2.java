package com.zadanie2;

public class Zadanie2 {

    public static void main(String[] args) {

        int[] tablica1 = new int[] { 50, 42, 102, 37 };
        int[] tablica2 = new int[] { 0, 13, 27};

        wypisz(tablica1);
        wypisz(tablica2);
    }

    public static void wypisz(int[] tab) {
        System.out.println("Wywolanie funkcji...");

        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                System.out.println(tab[i]);
            }
        }
    }
}
