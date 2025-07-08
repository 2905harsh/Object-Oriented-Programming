public class child extends parent{

 // if you use @Override here, it will give an error because static methods cannot be overridden.
  static void display(){
    System.out.println("Hey i am enjoying in child class.");
  }
  
}
