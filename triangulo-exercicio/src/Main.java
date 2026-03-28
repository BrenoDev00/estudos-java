import entities.Triangle;

public class Main {
    public static void getTheLargestArea(Triangle triangle1, Triangle triangle2) {
        if (triangle1.area > triangle2.area) {
            System.out.println("área do tri.1 é maior");
        } else {
            System.out.println("área do tri.2 é maior");
        }


    }

    public static void main(String[] args) {
        var triangle1 = new Triangle(3, 4, 5);
        var triangle2 = new Triangle(7.50, 4.50, 4.02);

        triangle1.calculateArea();
        triangle2.calculateArea();

        getTheLargestArea(triangle1, triangle2);
    }


}