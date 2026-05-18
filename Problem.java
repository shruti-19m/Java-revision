
import java.util.Scanner;

public class Problem {
  public static void main(String[] args) {

   //---loop problem----

   Scanner sc = new Scanner(System.in);
   int number = 0;

   do { 
      System.out.println("input a number");
      number = sc.nextInt();
      System.out.print("here is your number: ");
      System.out.println(number);

       
   } while (number >= 10);

   System.out.println("THE END");
    
  }
}
