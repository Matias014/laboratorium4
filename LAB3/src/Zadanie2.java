import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        double[] tablica = new double[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ": ");
            tablica[i] = input.nextDouble();
        }

        int ilosc_ujemnych, ilosc_dodatnich;
        double suma_dodatnich, suma_ujemnych;

        ilosc_ujemnych = 0;
        ilosc_dodatnich = 0;
        suma_ujemnych = 0;
        suma_dodatnich = 0;

        for (int i = 0; i < 10; i++) {
            if (tablica[i] < 0) {
                ilosc_ujemnych++;
                suma_ujemnych += tablica[i];
            } else if (tablica[i] > 0) {
                ilosc_dodatnich++;
                suma_dodatnich += tablica[i];
            }
        }

        System.out.println("Ilosc dodatnich liczb: " + ilosc_dodatnich);
        System.out.println("Ilosc ujemnych liczb: " + ilosc_ujemnych);
        System.out.println("Suma dodatnich liczb: " + suma_dodatnich);
        System.out.println("Suma ujemnych liczb: " + suma_ujemnych);
    }
}
