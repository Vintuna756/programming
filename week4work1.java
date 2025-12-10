
/**
 * Write a description of class week4work1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class week4work1
{
 public static void main(String[]args)
 {
   Scanner obj=new Scanner(System.in);
   System.out.println("Please enter a marks");
   int marks = obj.nextInt();
   if(marks>=40)
    {
     System.out.println("Pass");
    }
   else if (marks<40 && marks>=0)
   {
     System.out.println("Fail");
    }
    else
    {
       System.out.println("Invalid marks"); 
    }
      
 }
}