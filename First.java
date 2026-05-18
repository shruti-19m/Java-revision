

public class First {

   public static void main(String[] args) { 
      //write ur code here
      //System.out.println("Velora");

      /*
      ____PRIMITIVE TYPES______
      
      variables
      String name ="velora";
      int age = 21;
      String neighbour = "Amoremio";

      String friend = neighbour;
      

       TYPES
      1.byte - 1 ( -128 to 127)
      2.short - 2
      3.int - 4 ( 1,2,3,....)
      4.long- 8
      5. float - 4 ( 3.14)
      6. Double -8
      7. char -2 (a,b,c,d)
      8.boolean -1 (true/false)
       

      //____EXAMPLE___
     
       byte age = 12;
       int phone = 1234567890;
       long phone2 =12345678900L;
       float pi = 3.14F;
       char letter = '@';
       boolean isAdult = false;
       */

       /*
       NON-PRIMITIVE TYPES

       String name = "velora";
       String friend = new String( "vincci");
       System.out.println(name.length());
       */
       
       //Strings--immutable
       /*
       1.---concatenate-----:adding two string.

       String name1 ="velora";
       String name2 ="amoremio";
       String name3 =name1 + " and " + name2;
       System.out.println(name3);
        

       //CharAt
        //String name ="velora";
       // System.out.println(name.charAt(0));

       // replace
        String name = "Aman";
        String name2 = name.replace('a','b');
        System.out.println(name2);
        System.out.println(name);

        //substring

        String name = "Aman and akku";
        System.out.println(name.substring(5,9)); // (include ,exclude)

        */

        //Arrays
         
        /* 
        int age = 30;
        int physics = 80;
        int chem = 98;
        int eng = 95 ;

        int[] marks = new int[3];
           marks[0] =97;
           marks[1] =98;
           marks[2] =95;

           System.out.println(marks[2]);

           //length
           System.out.println(marks.length);

           //sort
           System.out.println(marks[0]);
           Arrays.sort(marks);
           System.out.println(marks[0]);
           
           
           //----already known----

           int[] marks ={97, 98 ,95};

           int[][] finalMarks = {{97,98,95}, {95,95,98}};

           System.out.println(finalMarks[1][1]);

           */
          

           //casting
           double price = 100.00;
           double finalPrice = price +18; //implicit casting

           System.out.println(finalPrice);
            
           int p =100;
           int fp = p+ (int)18.18; //Explicit casting
           System.out.println(fp);
           

           //constants

           int age = 30;
           age = 31;
           age =32;

           final float PI =3.14F;
           System.out.println(PI);
           System.out.println("age");


           


           






   }


   }
