class Aa {
  final int DAY;

  public Aa() {
    this.DAY = 5;
    // this.DAY = 10; ERROR: cannot change final variable once assigned
  }

  public final void show() {
    System.out.println("Show in A!");
  }
}

class Bb extends Aa {
  /*
   * ERROR
   * 
   * @Override public void show() { System.out.println("Show in B!"); }
   */
}

public class FinalDemo {
  public static void main(String[] args) {
    /**
     * final variables - cannot be changed once assigned final methods - cannot be
     * overidden final classes - cannt be extended
     */
  }
}
