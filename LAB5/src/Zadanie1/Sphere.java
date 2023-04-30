package Zadanie1;

public class Sphere {

    private double r;

    public Sphere(double r) {
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

    public double volume(double r) {
        return (4 * Math.PI * Math.pow(r, 3)) / 3;
    }

    public double area(double r) {
        return 4 * Math.PI * (r * r);
    }

    public void show() {
        System.out.println("Figure: Cone");
        System.out.println("Radius: " + this.r);
        System.out.println("Area: " + area(this.r));
        System.out.println("Volume: " + volume(this.r));
    }
}
