package QUESTION_1;

public class prime {
    public boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        else {
            for (int i=2;i<n/2;i++)
                if (n%i==0){
                    return false;
                }
                else {
                    return true;
                }
        }
        return true;
    }
        public  void printPrime(int n){
        int count = 0;
            for (int i=0;count<n;i++){
               boolean b=isPrime(i);
               if (b)
               {
                   System.out.print(i+" ");
                   count++;
               }
               
            }
        System.out.println();

        }
}
