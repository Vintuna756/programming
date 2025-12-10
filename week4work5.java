
/**
 * Write a description of class week4work5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class week4work5
{
  public static void main (String[]args)
  {
   Scanner obj = new Scanner(System.in);
   System.out.println("Please enter the mp");
  Float mp = obj.nextFloat();
  System.out.println("Please enter the category");
   String abc=obj.next();
  //convert it into char data type
  char category= abc.charAt(0);
  
  //switch statement
  switch (category)
  {
     case 'A' : 
          double sp1 = mp -(mp*0.6);
      System.out.println(sp1);
     break;
      case 'B' :
          double sp2 = mp - (mp*0.4);
                 System.out.println(sp2);
                 break;
      case 'C' :
          double sp3 = mp -(mp*0.2);
      System.out.println(sp3);  
      break;
      case 'D' :
          double sp4 = mp -(mp*0.1);
      System.out.println(sp4);
      break;
      default : System.out.println("Not Available");
      
      
  }
  
  
   
   
      
  }
}