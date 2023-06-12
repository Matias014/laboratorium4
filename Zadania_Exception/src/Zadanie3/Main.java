package Zadanie3;

public class Main {

    public static void main(String[] args) {

        int[] tablica = { 1, 2, 3, 4 };

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(tablica[i]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error => " + e);
            }
        }
    }
}
