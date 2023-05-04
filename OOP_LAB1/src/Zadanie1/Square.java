package Zadanie1;

public class Square {

    private double a;

    public Square(double a) {
        if (a > 0) {
            this.a = a;
        } else {
            this.a = 1;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0) {
            this.a = a;
        } else {
            this.a = 1;
        }
    }

    public void show() {
        System.out.println("Figure: Square");
        System.out.println("Side a: " + this.a);
        System.out.println("Area: " + area(this.a));
        System.out.println("Circuit: " + circuit(this.a));
    }

    public double area(double a) {
        return a * a;
    }

    public double circuit(double a) {
        return 4 * a;
    }
}
