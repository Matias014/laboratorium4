package Zadanie1;

public class Rectangle {

    private double a, b;

    public Rectangle(double a, double b) {
        if (a > 0) {
            this.a = a;
        } else {
            this.a = 1;
        }

        if (b > 0) {
            this.b = b;
        } else {
            this.b = 1;
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

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b > 0) {
            this.b = b;
        } else {
            this.b = 1;
        }
    }

    public double area(double a, double b) {
        return a * b;
    }

    public double circuit(double a, double b) {
        return 2 * (a + b);
    }

    public void show() {
        System.out.println("Figure: Rectangle");
        System.out.println("Side a: " + this.a);
        System.out.println("Side b: " + this.b);
        System.out.println("Area: " + area(this.a, this.b));
        System.out.println("Circuit: " + circuit(this.a, this.b));
    }
}
