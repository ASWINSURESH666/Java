package QUESTION_4;


public class ComplexMain {
    public static void main(String[] args) {
        // Create two complex numbers
        Complex num1 = new Complex(3, 4);
        Complex num2 = new Complex(1, -2);

        System.out.print("Complex Number 1: ");
        num1.printComplexNumber();

        System.out.print("Complex Number 2: ");
        num2.printComplexNumber();

        Complex sum = ComplexOperations.add(num1, num2);
        System.out.print("Sum of Num1 and Num2: ");
        sum.printComplexNumber();
        
        Complex product = ComplexOperations.multiply(num1, num2);
        System.out.print("Product of Num1 and Num2: ");
        product.printComplexNumber();

        double modulus1 = ComplexOperations.getModulus(num1);
        double modulus2 = ComplexOperations.getModulus(num2);
        System.out.println("Modulus of Complex Number 1: " + modulus1);
        System.out.println("Modulus of Complex Number 2: " + modulus2);
    }
}
