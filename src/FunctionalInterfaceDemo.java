@FunctionalInterface // (one abstract method)
interface Abc {
  void show();

  default void display() { // possible in >= Java 8
    System.out.println("In show!");
  }
}

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
    Abc obj = () -> { // lambda expressions (only possible in FUnctional Interface)
      System.out.println("I'm the best!");
    };
  }
}
