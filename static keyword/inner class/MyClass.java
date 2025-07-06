// Outer Classes Cannot be Static.
// Only inner classes can be static or not static.

public class MyClass{

  class innerClass1{        
    String name;
    public innerClass1(String name){
      this.name = name;
    }
  }
 
  static class innerClass2{
    String username;
    public innerClass2(String username){
      this.username = username;
    }

  }

  public static void main(String[] args) {

    innerClass2 obj2 = new innerClass2("JOHN1234"); // The class(innerClass2) is static, so it can be instantiated without an instance of MyClass.
    System.out.println("Username: " + obj2.username); // Output: Username: JOHN1234

    innerClass2 obj3 = new innerClass2("LISA0412");
    System.out.println("Username: " + obj3.username); // Output: Username: LISA0412


    // This gives an error.
    innerClass1 obj1 = new innerClass1(); // The class(innerClass1) itself is dependent on Outer class which is MyClass. If you want to instantiate innerClass1, you need an instance of MyClass.
    
  }

}




