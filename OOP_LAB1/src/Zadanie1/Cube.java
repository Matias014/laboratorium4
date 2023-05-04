package Zadanie1;

public class Cube {

    private double a;

    public Cube(double a) {
        if (a > 0) {
            this.a = a;
        } else {
            this.a = 1;
        }
    }

    public double getR() {
        return a;
    }

    public void setR(double a) {
        if (a > 0) {
            this.a = a;
        } else {
            this.a = 1;
        }
    }

    public double area(double a) {
        return 6 * Math.pow(a ,2);
    }

    public double volume(double a) {
        return Math.pow(a, 3);
    }

    public void show() {
        System.out.println("Figure: Cube");
        System.out.println("Side a: " + this.a);
        System.out.println("Area: " + area(this.a));
        System.out.println("Volume: " + volume(this.a));
    }
}
