package QUESTION_8;

interface _3DShapes{
    void printVolume();
    void printArea();
}

class Cylinder implements _3DShapes {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void printVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Cylinder Volume: " + volume);
    }

    @Override
    public void printArea() {
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.println("Cylinder Surface Area: " + area);
    }
}

class Sphere implements _3DShapes {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void printVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Sphere Volume: " + volume);
    }

    @Override
    public void printArea() {
        double area = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Sphere Surface Area: " + area);
    }
}
