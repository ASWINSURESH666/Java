package QUESTION_3;
import java.util.Scanner;


public class StudentMarks {
    
}

class student {
    String name;
    int num;
    int array[] = new int[5];
    int total;
    
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of the Student: ");
        name=sc.nextLine();
        
        System.out.print("Enter the Roll Number: ");
        num=sc.nextInt();
        
        for(int i=0;i<5;i++){
            System.out.print("SUBJECT "+(i+1)+" : ");
            array[i] = sc.nextInt();
        }
    }
    
    void Calculatetotalmarks(){
        total=0;
        for (int i=0;i<5;i++){
            total = total+array[i];
        }  
    }
    
    int getTotalMark(){
        return total;
    }
    
    void printdetails(){
        System.out.println("Name of the Student: "+name);
        System.out.println("Roll Number of the Student: "+num);
        System.out.println("Marks of the Student: "+total);
        for(int i=0;i<5;i++){
            System.out.println("Marks "+(i+1)+" : "+array[i]);
        }
        
    }
}
