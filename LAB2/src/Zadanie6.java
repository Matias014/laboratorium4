import java.util.Scanner;

public class Zadanie6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int liczba;

        while (true) {
            System.out.print("Podaj liczbe calkowita: ");
            liczba = input.nextInt();

            if (liczba < 0) {
                break;
            }
        }
    }
}
