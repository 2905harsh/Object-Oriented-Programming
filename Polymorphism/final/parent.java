public class parent {

  final void giveInfo(){
    System.out.println("Hey I am in parent class.");
  }

}

// If a method is declared as final in a class , then it cannot be overridden in any of its child class.
//  Methods like this that are declared as final can some how provide a performance enhancer because the compiler is free to inline the calls to them because the compiler will know that these methods will not be overridden and i know overriding occurs at runtime. When a method is called Java compiler can copy the code directly with the compil code of calling method, hence eliminating the overhead associated with the which method to be resolved, it know that it will be only one to be resolved.

/* 

Performance Optimization with final Methods
	•	Declaring a method as final can help the Java compiler optimize performance.
	•	Since the compiler knows that a final method cannot be overridden, it can safely perform method inlining — this means:
  Instead of generating a method call at runtime, the compiler may replace the call with the actual body of the method during compilation.
	•	This eliminates the overhead of dynamic method resolution (which normally happens at runtime through virtual method tables for polymorphic calls).
	•	In other words, the compiler doesn’t have to check which version of the method to call (since it’s guaranteed to be the only one), improving execution speed and efficiency.

  */ 