package Zadanie1;

public class Circle {

    private double r;

    public Circle(double r) {
        if (r > 0) {
            this.r = r;
        } else {
            this.r = 1;
        }
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if (r > 0) {
            this.r = r;
        } else {
            this.r = 1;
        }
    }

    public double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public double circuit(double r) {
        return (2 * r) * Math.PI;
    }

    public void show() {
        System.out.println("Figure: Circle");
        System.out.println("Radius: " + this.r);
        System.out.println("Area: " + area(this.r));
        System.out.println("Circuit: " + circuit(this.r));
    }
}
