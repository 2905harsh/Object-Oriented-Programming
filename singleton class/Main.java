public class Main {
  public static void main(String[] args) {
    singleton obj1 = singleton.getInstance(); //Since we are using the getInstance method with the class name, we will make this method static.
    singleton obj2 = singleton.getInstance();
    singleton obj3 = singleton.getInstance();
  }
  // All obj1, obj2, and obj3 will point to the same instance of singleton class.
}
