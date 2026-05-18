
import java.util.Scanner;

public class Main {
   
   public static void main(String[] args) {
      //How to take INPUT?
     /* 
      Scanner sc = new Scanner(System.in);
      System.out.println("Input Your Name ");
      String name = sc.next(); //print only name
     // String name = sc.nextline();//print a line
      System.out.println(name);

      */

      //comparison OPerators

     // a == b
     //a != b
     // a < b
     // a > b
     //a =< b
     // a >= b

     //conditional Statment
     
     boolean isSunUp =false;
     if(isSunUp == true)
        System.out.println("day");
      else
         System.out.println("night");


      int age = 30;
      if (age >18)
         System.out.println("can vote");
      else
         System.out.println("can't vote");

      //Logical operators

      //&&
      int a = 30;
      int b = 40;

      // if(a <50 && b <50)
      //    System.out.println("both less then 50");

      //||(or)
      if(a <50 && b <50)
        System.out.println("atleast one less then 50");


      Scanner sc = new Scanner(System.in);
      //pen = 10; notebook = 40

      int cash = sc.nextInt();
      if (cash < 10) {
         System.out.println("cannot buy anything");
         System.out.println("get more cash");
      }

      else if (cash > 10 && cash <50) {
         System.out.println("can get 1 thing");

      }

      else {
         System.out.println("can get both");
      }

      
      //conditional statements -- SWITCH
      int day = 1;  //1-monday;  2- tuesday

      switch(day) {
         case 1 :
            System.out.println("monday");
            break;
         case 2 :
            System.out.println("tuesday");
            break;
          default:  
              System.out.println("wed - sun");   

      }
      

      //---LOOPS---

      



       

      
   }
}
