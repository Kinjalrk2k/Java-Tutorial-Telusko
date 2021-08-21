class Aaa {
  public void show() {
    System.out.println("Show in A!");
  }
}

interface Bbb {
  void display();
}

public class AnonymousExample {
  public static void main(String[] args) {
    Aaa obj = new Aaa() {
      @Override
      public void show() {
        System.out.println("I'm the best!");
      }
    }; // Anonymous class

    obj.show();

    Bbb obj2 = new Bbb() {
      @Override
      public void display() {
        System.err.println("Implemented here!");
      }
    };

    obj2.display();
  }
}
