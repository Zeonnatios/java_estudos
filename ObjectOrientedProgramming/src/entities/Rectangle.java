package entities;

public class Rectangle {

    public double width;
    public double height;

    public double calculateArea(){
        return width * height;
    }

    public double calculatePerimeter(){
        return 2 * (width + height);
    }

    public double calculateDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

}
