package QUESTION_3;


public class StudentMarksMain {
   public static void main(String[] args){
    student student1 = new student();
    student student2 = new student();
    
    System.out.println("Enter the Details of Students: ");
    student1.getDetails();
    student2.getDetails();
    student1.Calculatetotalmarks();
    student2.Calculatetotalmarks();
    student1.printdetails();
    student2.printdetails();
    
    } 
}
