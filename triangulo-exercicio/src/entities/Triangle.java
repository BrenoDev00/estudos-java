package entities;

public class Triangle {
    public double sideA;
    public double sideB;
    public double sideC;

    public double area;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public void calculateArea() {
        double semiPerimeter = (this.sideA + this.sideB + this.sideC) / 2.0;

        this.area = Math.sqrt(semiPerimeter * (semiPerimeter - this.sideA) * (semiPerimeter - this.sideB) * (semiPerimeter - this.sideC));


    }
}
