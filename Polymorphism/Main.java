public class Main {
  public static void main(String[] args) {
    shapes s = new shapes();
    s.area(); // Calls the method in shapes class // Output: I am in shapes

    circle c = new circle();
    c.area(); // Calls the method in circle class  // Output: Area is circle of radius

    sqaure sq = new sqaure();
    sq.area(); // Calls the method in sqaure class // Output: Area is sqaure of sides


    // What if reference varaible is of parent class and object is of child class?

    // shapes class have area() method.
    // circle class also override the area() method.

    shapes s1 = new circle();

    s1.area(); // Calls the method in circle class // Output: Area is circle of

    // But Why And How? Why not area() of shapes class runs ?

    // Method of the child class is called always and it is called as "Upcasting" .
    // This is because of dynamic method dispatch in Java, which allows the JVM to determine the
    // method to be called at runtime based on the actual object type, not the reference type.
    // But we still cannot remove the area method from shapes-class because it is the reference variable that determines what all are accessible.But which one will be called(class type or object type) is determined by the actual object type at runtime.
    }
}
