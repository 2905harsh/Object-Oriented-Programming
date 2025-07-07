public class box
 {
  public int length;
  public int width;
  public int height;

  box(){
    this.length = -1;
    this.width = -1;
    this.height = -1;
  }

  //cube
  box(int side){
    this.length=side;
    this.width=side;
    this.height=side;
  }

  // cuboid
  box(int length, int width, int height){
    this.length = length;
    this.width = width;
    this.height = height;
  }

  box(box old){
    this.length = old.length;
    this.width = old.width;
    this.height = old.height;
  }

  void printInfo(){
    System.out.println("HEY I AM A BOX");
  }
}
