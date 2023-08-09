package QUESTION_8;

public class ShapesMain {
    public static void main(String[] args) {

        _3DShapes cylinder = new Cylinder(3.0, 5.0);
        cylinder.printVolume();
        cylinder.printArea();


        _3DShapes sphere = new Sphere(4.0);
        sphere.printVolume();
        sphere.printArea();
    }
}
