// Types of interface:
// 1. Normal: has multiple methods
// 2. Single Abstract method (SAM) -> Functional Interface (>= Java 8)
// 3. Marker: No methods

interface Writer {
  int num = 8; // by default it's a final variable

  void write(); // by default: it's public abstract

  static void display() { // in >= Java 8 (call with Writer.display())
    System.out.println("In display!");
  }
}

class Pen implements Writer {
  @Override
  public void write() {
    System.out.println("I'm a Pen");
  }
}

class Pencil implements Writer {
  @Override
  public void write() {
    System.out.println("I'm a Pencil");
  }
}

class Kit {
  public void doSomething(Writer p) {
    p.write();
  }
}

public class InterfaceDemo {
  public static void main(String[] args) {
    Kit k = new Kit();

    // Writer w = new Writer() // ERROR: Cannot creae object of an Interface
    Writer p = new Pen();

    k.doSomething(p);
  }
}
