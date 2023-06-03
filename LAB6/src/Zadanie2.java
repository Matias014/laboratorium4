import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Map<String, String> imiona = new HashMap<String, String>();
        String imie1, imie2;

        while (true) {
            System.out.print("Podaj pierwsze imie: ");
            imie1 = in.next();

            if (imie1.equals("-")) {
                break;
            }

            System.out.print("Podaj drugie imie: ");
            imie2 = in.next();

            if (imie2.equals("-")) {
                break;
            }

            imiona.put(imie1, imie2);
        }

        System.out.println("Podaj pierwsze szukane imie: ");
        imie1 = in.next();

        System.out.println("Klucz: " + imiona.get(imie1));;
    }
}
