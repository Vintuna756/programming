
/**
 * Write a description of class week4work3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class week4work3
{
 public static void main (String[]args)
 {
  Scanner obj = new Scanner(System.in);
  System.out.println("Please enter a number");
  int n = obj.nextInt();
  //nested if
  if(3%3==0)
  {
    if(n %5==0)
    {
        System.out.println ("both 3 & 5");
    }
    else
    {
      System.out.println ("divisible by 3 but not by 5");  
    }
  }
  else
  {
    System.out.println("It is not divisible by both");  
  }
  
  
 }
}