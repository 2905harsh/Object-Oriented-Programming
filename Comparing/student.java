public class student implements Comparable<student>{  // Comparable is a generic interface. // It contains a abstract compareTo method which we need to override.
  private int rollNo;
  private int marks;

  public student(int rollNo, int marks) {
    this.rollNo = rollNo;
    this.marks = marks;
  }

  @Override
  public int compareTo(student other){
    int diff = this.marks-other.marks;
    return diff;
  }

}