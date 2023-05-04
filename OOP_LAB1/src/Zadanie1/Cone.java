package Zadanie1;

public class Cone {

    private double r, h;

    public Cone(double r, double h) {
        if (r > 0) {
            this.r = r;
        } else {
            this.r = 1;
        }

        if (h > 0) {
            this.h = h;
        } else {
            this.h = 1;
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

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if (h > 0) {
            this.h = h;
        } else {
            this.h = 1;
        }
    }

    public double getL(double r, double h) {
        return Math.hypot(this.r, this.h);
    }

    public double area(double r, double h) {
        return Math.PI * Math.pow(r, 2) + Math.PI * r * getL(r, h);
    }

    public double volume(double r, double h) {
        return (Math.PI * Math.pow(r, 2) * h) / 3;
    }

    public void show() {
        System.out.println("Figure: Cone");
        System.out.println("Radius: " + this.r);
        System.out.println("Height: " + this.h);
        System.out.println("L: " + getL(this.r, this.h));
        System.out.println("Area: " + area(this.r, this.h));
        System.out.println("Volume: " + volume(this.r, this.h));
    }
}
