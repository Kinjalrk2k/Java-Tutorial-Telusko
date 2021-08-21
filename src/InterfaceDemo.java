interface Writer {
  void write(); // by default: it's public abstract
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
