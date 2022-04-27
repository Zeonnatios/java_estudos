package entities;

public class Triangle {

    public double A;
    public double B;
    public double C;


    public double calculaeArea() {
        double perimeter = (A * B * C) / 2;
        return Math.sqrt(perimeter * (perimeter - A) * (perimeter - B) * (perimeter - C));
    }


}
