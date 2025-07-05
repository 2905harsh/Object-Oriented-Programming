// this keyword with static
public class car{
  int price;
  String name;
  
  static void GreetCustomer(){
    System.out.println("Welcome to the car showroom!");
    System.out.println("We have"+this.name+"available for you at a price of "+this.price); // This will give an error because 'this' refers to the current object of the class , and static methods are part of the class, not an instance of the class.
  }
  
  car(int price, String name){
    this.price = price; // 'this' refers to the current object
    this.name = name; // 'this' refers to the current object
  }
}
