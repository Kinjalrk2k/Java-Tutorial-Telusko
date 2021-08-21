
class Outer {
  int a;

  public void show() {
    System.out.println("In show!");
  }

  class InnerMember { // member class
    public void display() {
      System.out.println("In display!");
    }
  }

  static class InnerStatic {
    public void print() {
      System.out.println("In print!");
    }
  }
}

public class InnerDemo {
  public static void main(String[] args) {
    Outer obj = new Outer();
    obj.show();

    Outer.InnerMember obj1 = obj.new InnerMember();
    obj1.display();

    Outer.InnerStatic obj2 = new Outer.InnerStatic();
    obj2.print();
  }
}
