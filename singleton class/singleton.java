// If you want only one instance of this class, then you should not allow anyone to call the constructor of this class.
public class singleton {
  private singleton(){
  }

  private static singleton instance; // since this instance is not dependent on any object of this class, we can make it static.

  public static singleton getInstance(){
    // Check whether 1 obj is created or not
    if(instance == null) {
      instance = new singleton(); // constructor is private, so this line can only be executed within this class.
    }
    return instance;
  }
}
