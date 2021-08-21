
public class WrapperDemo {
  public static void main(String[] args) {
    int i = 5; // primitive data type (not an object)
    Integer ii = 5; // Wrapper class (object)

    /**
     * NOTE: Integer ii = new Integer(5); is deprecated
     */

    Float ff = 2.04f;

    Integer iii;
    iii = new Integer(i); // Boxing / Wrapping
    iii = i; // AutoBoxing

    i = iii.intValue(); // Unboxing / Unwrapping
    i = iii; // AnutoUnboxing

    /**
     * Primitive datatypes are faster than Wrapper classes
     */

    String str = "123";
    int n = Integer.parseInt(str);
    System.out.println(n);
  }
}
