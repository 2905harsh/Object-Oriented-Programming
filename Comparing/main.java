public class main {
  public static void main(String[] args) {
    student rahul = new student(12,89);
    student anjali = new student(15,95);

    // Comparing on the basis of marks .
    if(rahul.compareTo(anjali) < 0) {
      System.out.println("Rahul has less marks than Anjali");
    } else if (rahul.compareTo(anjali) > 0) {
      System.out.println("Rahul has more marks than Anjali");
    } else {
      System.out.println("Rahul and Anjali have the same marks");
    }
  }
}
