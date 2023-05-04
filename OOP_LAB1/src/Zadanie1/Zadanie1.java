package Zadanie1;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        run();
    }

    public static void menu() {
        System.out.println("\n-----------------------------------------");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Cone");
        System.out.println("5. Cube");
        System.out.println("6. Cuboid");
        System.out.println("7. Sphere");
        System.out.println("8. Exit");

        System.out.print("\nChoose: ");
        int choice = getInt();
        System.out.println("-----------------------------------------");

        double radius, a, b, height, c;
        switch (choice) {
            case 1: // Circle
                System.out.print("Input radius: ");
                radius = getDouble();
                Circle object1 = new Circle(radius);
                object1.show();
                break;
            case 2: // Rectangle
                System.out.print("Input a: ");
                a = getDouble();
                System.out.print("Input b: ");
                b = getDouble();
                Rectangle object2 = new Rectangle(a, b);
                object2.show();
                break;
            case 3: // Square
                System.out.print("Input a: ");
                a = getDouble();
                Square object3 = new Square(a);
                object3.show();
                break;
            case 4: // Cone
                System.out.print("Input radius: ");
                radius = getDouble();
                System.out.print("Input height: ");
                height = getDouble();
                Cone object4 = new Cone(radius, height);
                object4.show();
                break;
            case 5: // Cube
                System.out.print("Input a: ");
                a = getDouble();
                Cube object5 = new Cube(a);
                object5.show();
                break;
            case 6: // Cuboid
                System.out.print("Input a: ");
                a = getDouble();
                System.out.print("Input b: ");
                b = getDouble();
                System.out.print("Input c: ");
                c = getDouble();
                Cuboid object6 = new Cuboid(a, b, c);
                object6.show();
                break;
            case 7:
                System.out.print("Input radius: ");
                radius = getDouble();
                Sphere object7 = new Sphere(radius);
                object7.show();
                break;
            case 8:
                System.exit(0);
            default:
                System.exit(0);
        }
    }

    public static void run() {
        System.out.println("-----------------------------------------");
        System.out.println("------------FIGURE CALCULATOR------------");
        System.out.println("-----------------------------------------");

        while (true) {
            menu();
        }
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static double getDouble() {
        return new Scanner(System.in).nextDouble();
    }
}
