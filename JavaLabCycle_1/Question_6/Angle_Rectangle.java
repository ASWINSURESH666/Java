package QUESTION_6;

class Rectangles {
    private double length;
    private double breadth;
    private double area;

    public Rectangles(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        area = length * breadth;
    }

    public double getArea() {
        return area;
    }
}

class Box extends Rectangles {
    private double height;
    private double volume;

    public Box(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public void calculateVolume() {
        super.calculateArea(); 
        volume = getArea() * height;
    }

    public double getVolume() {
        return volume;
    }
}
