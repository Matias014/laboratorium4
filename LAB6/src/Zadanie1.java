import java.util.*;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String imie;
        List<String> imiona = new ArrayList<>();

        while (true) {
            System.out.print("Podaj imie: ");
            imie = in.next();

            if (imie.equals("-")) {
                System.out.println("KONIEC");
                break;
            }

            imiona.add(imie);
        }

        Set<String> imionaUnikalne = new HashSet<>();
        imionaUnikalne.addAll(imiona);

        System.out.println("\n\nImiona:");
        for (String element : imionaUnikalne) {
            System.out.println(element);
        }
    }
}
