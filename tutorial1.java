
/**
 * Write a description of class tutorial1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class tutorial1
{
    public static void main (String[]args)
    {
       Scanner obj = new Scanner(System.in);
       System.out.println("Please enter your age :");
       int age = obj.nextInt();
       //if-else
       if(age>=18)
       {
         System.out.println("Eligible for citizenship");
       }
       else
       {
           System.out.println("Not eligible for citizenship");
       }
    }
}