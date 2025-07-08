public class Main {
  public static void main(String[] args) {
    parent p = new parent();

    p.display();
    // but since this method is static , it does not depend upon the object of that class .Hence we can call it directly using the class name.
    parent.display();

    child c = new child();
    c.display();

   }
}

// Output:
// Hey i am enjoying in parent class.
// Hey i am enjoying in parent class.
// Hey i am enjoying in child class.