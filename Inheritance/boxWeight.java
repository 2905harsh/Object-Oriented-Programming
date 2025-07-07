public class boxWeight extends box{
  public int weight;

  boxWeight(){
    super();  // Call the default constructor of the parent class to initialize length, width, and height
    this.weight = -1;
  }

  boxWeight(int length,int width, int height,int weight){
    super(length, width, height);  // Call the constructor of the parent class to initialize length, width, and height
    this.weight = weight;
  }

  boxWeight(boxWeight other){
    super(other);  // Call the copy constructor of the parent class to copy length, width, and height
    // We are passing 'other' which is of boxWeight type to call the parent class's copy constructor which takes old of box type. 
    // But this does not give error because boxWeight have the access to parent class members and can be used there.
    this.weight = other.weight;  // Copy the weight property
  }
}
