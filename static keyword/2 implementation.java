//1. Whenever you are accessing the static variable , modifying the static variable, declaring the static variable. Don't use it via object name. It will work, but still don't use it. Convention is used via ClassName.static variable.
public class implementation {
  public static void main(String[] args) {

    System.out.println(human.Population); // 0 (default value) We are accessing the static variable Population without creating an instance of the class human.

    human h1 = new human("john",25);
    human h2 = new human("alex",34);

    System.out.println(human.Population); // 2 (after creating two instances of human, Population is incremented by 2)

  }
}

// 2. One of the most common static method is public static void main.
/*
 The main method in Java is declared as static — and before understanding why, let’s think about what static actually means.

In Java, static means that a method or variable belongs to the class itself, not to any specific object. That means you can use it without creating an object of the class.

Now, the main method is the very first thing that runs whenever you execute a Java program. If the main method wasn’t there, your program wouldn’t even start — so it’s mandatory.

Now here’s the key point: If main wasn’t declared as static, you would need to create an object of that class to run anything inside it.

But that creates a paradox — how would you create an object before running main, when main itself is the entry point that starts everything?

That’s exactly why main has to be static — so it can be called without an object, allowing the program to launch successfully.

In short, making main static lets the JVM run it directly — and only after that, you can create objects and run the rest of your logic.
 */
 
