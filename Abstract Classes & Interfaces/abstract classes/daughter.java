public class daughter extends parent{

  // Constructor for daughter class
  public daughter(int age){
    super(age);
  }

  @Override // overriding the abstract method from parent class
  void carrer(){
    System.out.println("I want to be a Data Scientist");
  }
}

