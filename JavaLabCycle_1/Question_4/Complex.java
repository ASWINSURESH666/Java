package QUESTION_4;

public class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void printComplexNumber() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }

    public double getReal() {
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
}

class ComplexOperations {
    public static Complex add(Complex num1, Complex num2) {
        double realPart = num1.getReal() + num2.getReal();
        double imaginaryPart = num1.getImaginary() + num2.getImaginary();
        return new Complex(realPart, imaginaryPart);
    }

    public static Complex multiply(Complex num1, Complex num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new Complex(realPart, imaginaryPart);
    }

    public static double getModulus(Complex num) {
        double realPartSquared = num.getReal() * num.getReal();
        double imaginaryPartSquared = num.getImaginary() * num.getImaginary();
        return Math.sqrt(realPartSquared + imaginaryPartSquared);
    }
}
