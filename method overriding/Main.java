import java.util.*;
import java.io.*;

class Vehicle{
  void run(){
    System.out.print("Vehicle is running. \n");
  }
}

class Bike extends Vehicle{
  void run(){
    System.out.print("Bike is running. \n");
  }
}

public class Main {
  public static void main(String[] args){
    Vehicle v = new Vehicle();
    v.run();
    Vehicle b = new Bike();
    b.run();
  }
}

