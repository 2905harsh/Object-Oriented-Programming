public final class parent2 {
  final void giveInfo() {
    System.out.println("Hey I am in parent class.");
  }

  // The final keyword here ensures that this class cannot be subclassed.
  // Any attempt to extend this class will result in a compile-time error.
  // This is useful when you want to prevent inheritance for security or design reasons.
  // For example, if you have a class that provides critical functionality and you want to ensure
  // that it cannot be altered or extended in any way, you can declare it as final.
  // This can also help with performance optimizations, as the Java compiler can make certain assumptions
  // about the final class that it cannot make about non-final classes.
  // Note: If a class is declared as final, all its methods are implicitly final,
  // meaning they cannot be overridden in any subclass.
  // This is useful when you want to ensure that the behavior of the class remains consistent and
  // cannot be altered by subclasses.
  
}
