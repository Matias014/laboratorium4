import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        Run();
    }

    public static void Run() {
        int wybor;

        while (true) {
            Menu();

            System.out.print("\n\tWybierz: ");
            wybor = InputInt();

            switch (wybor) {
                case 1 -> Suma();
                case 2 -> Roznica();
                case 3 -> Iloczyn();
                case 4 -> Iloraz();
                case 5 -> Potega();
                case 6 -> Pierwiastek();
                case 7 -> FunTryg();
                default -> Close();
            }
        }
    }

    public static void Menu() {
        System.out.println("------------------------------");
        System.out.println("----------KALKULATOR----------");
        System.out.println("------------------------------");

        System.out.println("\n\t1 Suma" +
                "\n\t2 Roznica" +
                "\n\t3 Iloczyn" +
                "\n\t4 Iloraz" +
                "\n\t5 Potega" +
                "\n\t6 Pierwiastek" +
                "\n\t7 Funkcje trygonometryczne");

        System.out.println("------------------------------");
    }

    public static int InputInt() {
        Scanner input = new Scanner(System.in);
        int liczba = input.nextInt();
        return liczba;
    }

    public static String InputString() {
        Scanner input = new Scanner(System.in);
        String slowo = input.next();
        return slowo;
    }

    public static void Suma() {
        int a, b;

        System.out.print("\n\tPodaj a: ");
        a = InputInt();

        System.out.print("\tPodaj b: ");
        b = InputInt();

        System.out.println("\n\tSuma: " + (a + b));
    }

    public static void Roznica() {
        int a, b;

        System.out.print("\n\tPodaj a: ");
        a = InputInt();

        System.out.print("\tPodaj b: ");
        b = InputInt();

        System.out.print("\n\tRoznica: " + (a - b));
    }

    public static void Iloczyn() {
        int a, b;

        System.out.print("\n\tPodaj a: ");
        a = InputInt();

        System.out.print("\tPodaj b: ");
        b = InputInt();

        System.out.println("\n\tIloczyn: " + (a * b));
    }

    public static void Iloraz() {
        int a, b;

        System.out.print("\n\tPodaj a: ");
        a = InputInt();

        System.out.print("\tPodaj b: ");
        b = InputInt();

        if (b == 0) {
            System.out.println("\n\tNie mozna dzielic przez zero!");
        } else {
            System.out.println("\n\tIloraz: " + (a / b));
        }
    }

    public static void Potega() {
        int a, b;

        System.out.print("\n\tPodaj a: ");
        a = InputInt();

        System.out.print("\tPodaj b: ");
        b = InputInt();

        System.out.println("\n\tPotega: " + Math.pow(a, b));
    }

    public static void Pierwiastek() {
        int a;

        System.out.print("\n\tPodaj liczbe: ");
        a = InputInt();

        System.out.println("\n\tPierwiastek: " + Math.sqrt(a));
    }

    public static void FunTryg() {
        System.out.println("\n\t1 Sinus");
        System.out.println("\n\t2 Cosinus");
        System.out.println("\n\t3 Tangens");
        System.out.println("\n\t4 Cotangens");
        System.out.println("\n\tWybierz: ");

        int opcja = InputInt();
        int kat_w_stopniach;

        switch (opcja) {
            case 1:
                System.out.print("Podaj kat w stopniach: ");
                kat_w_stopniach = InputInt();
                System.out.println("Sinus: " + Math.sin((kat_w_stopniach / 180) * Math.PI));
                break;
            case 2:
                System.out.print("Podaj kat w stopniach: ");
                kat_w_stopniach = InputInt();
                System.out.println("Cosinus: " + Math.cos((kat_w_stopniach / 180) * Math.PI));
                break;
            case 3:
                System.out.print("Podaj kat w stopniach: ");
                kat_w_stopniach = InputInt();

                if (kat_w_stopniach % 90 != 0) {
                    System.out.println("Tangens: " + Math.tan((kat_w_stopniach / 180) * Math.PI));
                } else {
                    System.out.println("Nie da sie obliczyc tangensa!");
                }

                break;
            case 4:
                System.out.print("Podaj kat w stopniach: ");
                kat_w_stopniach = InputInt();

                if (kat_w_stopniach % 180 != 0) {
                    System.out.println("Cotangens: " + (1 / Math.tan((kat_w_stopniach / 180) * Math.PI)));
                } else {
                    System.out.println("Nie da sie obliczyc cotangensa!");
                }
            default:
                System.out.println("Wychodze z programu!");
                break;
        }
    }

    public static void Close() {
        String option;

        System.out.println("Czy chcesz wyjsc? [T/t]: ");
        option = InputString();

        if (option.equals("T") || option.equals("t")) {
            break;
        }
    }
}
