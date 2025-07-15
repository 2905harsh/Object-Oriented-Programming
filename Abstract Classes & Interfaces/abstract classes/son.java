public class son extends parent{

  // Constructor for son class
  public son(int age){
    super(age);
  }

  @Override // overriding the abstract method from parent class
  void carrer(){
    System.out.println("I want to be a Software Engineer");
  }

}
