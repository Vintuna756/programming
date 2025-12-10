
/**
 * Write a description of class tutorial3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class tutorial3
{
    public static void main(String[]args)
    {
       Scanner obj = new Scanner(System.in);
       System.out.println("Please enter your marks");
       int marks = obj.nextDouble();
       
       //if-else if ladder
       if(marks>=80 && marks<=100)
       {
        System.out.println("Scored A grade");   
       }
       else if(marks >= 60)
       {
        System.out.println("Scored B grade");   
       }
       else if(marks >= 40)
       {
           System.out.println("Scored C grade");
       }
       else if (marks >=35)
       {
           System.out.println("Scored D grade");
       }
       else if(marks <35 && marks > 0)
       {
           System.out.println("Scored NG ");
       }
       else
       {
           System.out.println("Invalid marks");
       }
    }
    
}