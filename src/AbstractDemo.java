abstract class Human {
  public abstract void eat();

  public void walk() {

  }
}

class Man extends Human { // concrete class
  @Override
  public void eat() {

  }
}

class Printer {
  public void show(Number i) {
    System.out.println(i);
  }
}

public class AbstractDemo {
  public static void main(String[] args) {
    // Human obj = new Human(); // ERROR: Cannot create object of abstract class
    Printer obj = new Printer();
    obj.show(5.4);
  }
}
