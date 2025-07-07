public class Main {
  public static void main(String[] args) {
    boxWeight b1 = new boxWeight(10,20,30,100); // from here 10 20 30 goes to parent class box via super.
    System.out.println("Length of box: " + b1.length);
    System.out.println("Width of box: " + b1.width);
    System.out.println("Height of box: " + b1.height);
    System.out.println("Weight of box: " + b1.weight);
  }
}


