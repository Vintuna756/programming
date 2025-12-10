
/**
 * Write a description of class week4work2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class week4work2
{
  public static void main (String[]args)
  {
    Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = obj.nextInt();
        if(a%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }  
  }
}