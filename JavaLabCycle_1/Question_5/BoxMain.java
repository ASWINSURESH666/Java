package QUESTION_5;

import java.util.Scanner;


public class BoxMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side length of the cube:");
        double sideLength = sc.nextDouble();
        Box cube = new Box(sideLength);
        cube.calculateArea();
        cube.calculateVolume();
        System.out.println("Cube:");
        cube.printAreaAndVolume();

        System.out.println("\nEnter the side lengths of the square prism:");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        Box squarePrism = new Box(side1, side2);
        squarePrism.calculateArea();
        squarePrism.calculateVolume();
        System.out.println("Square Prism:");
        squarePrism.printAreaAndVolume();

        System.out.println("\nEnter the dimensions of the rectangular prism:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double height = sc.nextDouble();
        Box rectangularPrism = new Box(length, breadth, height);
        rectangularPrism.calculateArea();
        rectangularPrism.calculateVolume();
        System.out.println("Rectangular Prism:");
        rectangularPrism.printAreaAndVolume();

        sc.close();
    }
}
