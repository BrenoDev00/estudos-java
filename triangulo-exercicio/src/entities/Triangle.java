package entities;

public class Triangle {
    public double sideA;
    public double sideB;
    public double sideC;

    public double area;
    private double semiPerimeter;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    private void calculateSemiPerimeter() {

        this.semiPerimeter = (this.sideA + this.sideB + this.sideC) / 2.0;


    }

    public void calculateArea() {
        this.calculateSemiPerimeter();

        this.area = Math.sqrt(this.semiPerimeter * (this.semiPerimeter - this.sideA) * (this.semiPerimeter - this.sideB) * (this.semiPerimeter - this.sideC));


    }
}
