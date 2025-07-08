public class circle extends shapes {
    @Override 
    void area() {
        System.out.println("Area is circle of radius");
    }
}
// @Override annotation is used to indicate that a method is intended to override a method in a superclass.
// It helps to catch errors at compile time if the method does not actually override a method in the superclass.
// In this case, the area method in the circle class is overriding the area method in the shapes class.
// If the method signature does not match, the compiler will throw an error, helping to ensure that the method is correctly overriding the intended method in the superclass.
// This is useful for maintaining code clarity and preventing bugs that can arise from incorrect method overrides.