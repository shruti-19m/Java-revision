
/* 
public class Oop1 {
   String name;
   int roll_no;

   public void printdata(){    // function
      System.out.println(name);
      System.out.println(roll_no);
   }

  
   public static void main(String[] args){
      Oop1 std1 = new Oop1();
      std1.name = "Velora";
      std1.printdata();


   }

}
   *//* 

//----Class Attributes----

class Student {

   String name;
   int roll_no;
   String address;


}
public class Oop1{
   public static void main(String[] args) {

   Student std1 = new Student();
   std1.name = "Velora";
   std1.roll_no = 10;
   std1.address ="Ranchi";

   }
}
*/

//---java class Methods---

class Dog{
   String name;
  // int license_id;


   public void eat(){
      System.out.println(name+"eats!");

   }
   
}
public class Oop1{
   public static void main(String[] args) {
       Dog dog1 = new Dog();
       dog1.name ="Bruno";
       dog1.eat();
   }
}
