public class club {
  public static void main(String[] args) {

    box b1 = new boxWeight();
    // We can access the properties of refernence variables.
    // Type of reference variables decides what properties we can access.
    System.out.println("Length of box: " + b1.length);
    System.out.println("Length of box: " + b1.width);
    System.out.println("Length of box: " + b1.height);
    System.out.println("Length of box: " + b1.weight); // Error :  because box class does not have weight property


    // Here you will have the access of whatever properties are in boxWeight class.
    // This means what properties you have access , you should be able to initailize them also.
    // But here when the object is itself of type box , how will you call the constructor of boxWeight class and initialize the weight property.
    // That is why it is giving the error.
    boxWeight b2 =  new box(12,2,3);
    // Hence you cannot have a child reference variable pointing to a parent object.

 }
}