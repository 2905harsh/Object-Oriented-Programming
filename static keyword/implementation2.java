/*
 1. Static method can only acces static data.
 2. We can access static method from non-static method beacuse it does not require an object to be called.
 */

public class implementation2 {
  public static void main(String[] args) {
   // Lets access the greeting method here (which is non-static) in main method (which is static).
    
   greeting(); // This will give an error because greeting() is a non-static method and cannot be called from a static context.
   // You cannot use this method here because something which is non-static , belongs to object.
   // Hence we cannot access anything non-static from static context
 
   goodbye(); // This will work because goodbye() is a static method and can be called from a static context.This does not require an object to be called. 

  }

  void greeting(){
    System.out.println("Hey , I m HARSH");
  }
  static void goodbye(){
    System.out.println("Goodbye , I m HARSH");
  }

}
