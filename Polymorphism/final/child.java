public class child extends parent{
   @Override
   void giveInfo(){ // This will cause a compile-time error because final methods cannot be overridden
     System.out.println("Hey I am in child class.");
  }
  
}