package QUESTION_5;

public class Box {
    private double length;
    private double breadth;
    private double height;
    private double area;
    private double volume;

    public Box(double side) {
        this.length = side;
        this.breadth = side;
        this.height = side;
    }

    public Box(double side1, double side2) {
        this.length = side1;
        this.breadth = side1;
        this.height = side2;
    }

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void calculateArea() {
        area = 2 * ((length * breadth) + (breadth * height) + (length * height));
    }

    public void calculateVolume() {
        volume = length * breadth * height;
    }

    public void printAreaAndVolume() {
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }

    public String getVolume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
