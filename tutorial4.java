
/**
 * Write a description of class tutorial4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class tutorial4
{
  public static void main (String[]args)
  {
      char grade = 'A';
      //switch
      switch (grade)
      {
          case 'A' :System.out.println("Your marks is >=80");
                     break;
          case 'B' :System.out.println("Your marks is >=60");
                     break;
          case 'C' :System.out.println("Your marks is >=40");
                    break;
          case 'D' :System.out.println("Your marks is >=35");
                    break;
          case 'F' :System.out.println("You have failed");
                    break;
          default : System.out.println("Invalid grades");          
      }
       
  }
}