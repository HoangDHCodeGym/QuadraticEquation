public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return  (this.getDiscriminant() >= 0) ? (-b + Math.pow(this.getDiscriminant(), 0.5))/(2 * this.a) : 0;
    }

    public double getRoot2() {
        return  (this.getDiscriminant() >= 0) ? (-b - Math.pow(this.getDiscriminant(), 0.5))/(2 * this.a) : 0;
    }

    public String toString() {
        if (this.getDiscriminant() > 0) {
            return "The equation has two roots: " + this.getRoot1() + " and " + this.getRoot2();
        } else if (this.getDiscriminant() == 0) {
            return "The equation has a double root: " + this.getRoot1();
        } else {
            return "The equation has no roots";
        }
    }

}
