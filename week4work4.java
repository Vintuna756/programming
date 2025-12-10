
/**
 * Write a description of class week4work4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class week4work4
{
 public static void main (String[]args)
 {
   //object  
  Scanner obj = new Scanner(System.in);
  System.out.println("Please enter the mp");
  Float mp = obj.nextFloat();
  System.out.println("Please enter the category");
   String abc=obj.next();
  //convert it into char data type
  char category= abc.charAt(0);
  
  //if-else if ladder
  if(category=='A')
  {
      double sp = mp -(mp*0.6);
      System.out.println(sp);
      
  }
  else if (category=='B')
  {
   double sp = mp -(mp*0.4);
   System.out.println(sp);
  }
  else if (category=='C')
  {
    double sp = mp -(mp*0.2);
   System.out.println(sp);  
  }
  else if (category=='D')
  {
    double sp = mp -(mp*0.1);
   System.out.println(sp);   
  }
  else
  {
     System.out.println("Not Available"); 
  }
  
  
}
}