class A {
  int i;

  public void show() {
    System.out.println("In A!");
  }
}

class B extends A {
  int i;

  @Override
  public void show() {
    // super.show();
    // super.i = 8;
    System.out.println("in B!");
  }

  public void config() {
    System.out.println("Config of B!");
  }
}

class C extends A {
  public void show() {
    System.out.println("In C!");
  }

}

public class OverridingDemo {
  public static void main(String[] args) {
    B obj1 = new B();
    obj1.show();

    A obj2 = new B(); // RUNTIME POLYMORPHISM
    obj2.show(); // B.show() is called (dynamic method dispatch)
    // obj2.config(); ERROR: class A doesn't have a method called "config"

    obj2 = new C();
    obj1.show(); // B.show() is called
  }
}
