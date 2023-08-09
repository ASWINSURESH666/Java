package QUESTION_6;

public class Angle_RectangleMain {
    public static void main(String[] args) {
        Rectangles rectangle = new Rectangles(5.0, 3.0);
        rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Box box = new Box(4.0, 3.0, 2.0);
        box.calculateVolume();
        System.out.println("Box Volume: " + box.getVolume());
    }
}
