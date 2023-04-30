import java.util.Scanner;

public class Zadanie5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String slowo;
        boolean czy_palindrom = true;

        System.out.print("Podaj slowo: ");
        slowo = input.next();

        for (int i = 0; i < slowo.length(); i++) {
            if (slowo.charAt(i) != slowo.charAt(slowo.length() - 1 - i)) {
                czy_palindrom = false;
            }
        }

        if (czy_palindrom == true) {
            System.out.println(slowo + " jest palindromem!");
        } else {
            System.out.println(slowo + " nie jest palindromem!");
        }
    }
}
