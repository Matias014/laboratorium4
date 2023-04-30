package Zadanie1;

public class Cuboid {

    private double a, b, c;

    public Cuboid(double a, double b, double c) {
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

        if (c > 0) {
            this.c = c;
        } else {
            this.c = 1;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c > 0) {
            this.c = c;
        } else {
            this.c = 1;
        }
    }

    public double area(double a, double b, double c) {
        return 2 * a * c + 2 * b * a + 2 * b * c;
    }

    public double volume(double a, double b, double c) {
        return a * b * c;
    }

    public void show() {
        System.out.println("Figure: Cuboid");
        System.out.println("Side a: " + this.a);
        System.out.println("Side b: " + this.b);
        System.out.println("Side c: " + this.c);
        System.out.println("Area: " + area(this.a, this.b, this.c));
        System.out.println("Volume: " + volume(this.a, this.b, this.c));
    }
}
