package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;


    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public String printResult(double finalResult) {
        return finalResult > 60
                ? "PASS!"
                : "MISSING " + String.format("%.2f", 60 - finalResult) + " POINTS!";
    }

}
