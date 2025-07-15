public abstract class parent {

  // We can have variables in an abstract class.
  int age;

  // We can have constructors in a abstract class . 
  public parent(int age){
    this.age = age;
  }

  // We cannot make abstract constructors.
  //  abstract parent() {}   // gives error modifier abstract not allowed here . 


  abstract void carrer();   // Abstract method and it must be overridden in the subclasses.


  static void hello(){
    System.out.println("Hello from parent class which is abstract class.");
  }

  void normal(){
    System.out.println("This is a normal method in abstract class.");
  }

}