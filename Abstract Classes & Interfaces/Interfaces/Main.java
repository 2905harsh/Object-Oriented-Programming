package Interfaces;
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.acc();
        myCar.brake();
        myCar.stop();

        System.out.println("Engine Price: " + Engine.PRICE);

        System.out.println("Now we are using the music system of car");
        Media media = new Car();
        media.start(); // Its starts the engine weirdly.
        media.stop(); // Its stops the engine weirdly.
    }
   
}
                  