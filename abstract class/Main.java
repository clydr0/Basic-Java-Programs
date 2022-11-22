import java.util.*;

abstract class Shape {
  int width, height;
  abstract int area();
}

class Rectangle extends Shape {
  Rectangle(int w, int h){
    this.width = w;
    this.height = h;
  }
  int area() {
    return width * height;
  }
}

class Triangle extends Shape {
  Triangle(int b, int h){
    this.width = b;
    this.height = h;
  }
  int area(){
    return width * height / 2;
  }
}

class Square extends Shape {
  Square(int w){
    this.width = w;
  }
  int area(){
    return width*width;
  }
}

public class Main {
  public static void main(String[] args) {
    Rectangle r = new Rectangle(2, 5);
    Triangle t = new Triangle(2, 5);
    Square s = new Square(12);
    System.out.println("area of square : "+ s.area()+"\narea of rectangle : "+ r.area() +"\narea of triangle : "+t.area());
  }
}


