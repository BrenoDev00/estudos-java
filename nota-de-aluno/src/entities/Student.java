package entities;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;
    private String status;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public String getName() {
        return this.name;
    }

    public double getGrade1() {
        return this.grade1;
    }

    public double getGrade2() {
        return this.grade2;
    }

    public double getGrade3() {
        return this.grade3;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
