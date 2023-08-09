package QUESTION_1;


public class primeMain {
    public static void main(String args[]){
        prime obj=new prime();
        int n=Integer.parseInt(args[0]); //changes string to int
        obj.printPrime(n);
    }
}
