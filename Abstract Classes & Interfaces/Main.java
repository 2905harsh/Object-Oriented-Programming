public class main {
  public static void main(String[] args) {

    son s = new son(34);
    s.carrer();
    System.out.println(s.age);

    daughter d = new daughter(53);
    d.carrer();
    System.out.println(d.age);


    parent.hello(); // Calling static method from parent class

    s.normal();


    // Abstract class name can be used as a reference variable 

    parent son2 = new son(23);
    son2.carrer();
    
  }
}

// Output:
/*
 I want to be a Software Engineer
34
I want to be a Data Scientist
53
Hello from parent class which is abstract class.
This is a normal method in abstract class.
I want to be a Software Engineer
 */