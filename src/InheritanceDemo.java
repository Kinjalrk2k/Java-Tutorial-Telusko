class Calculator { // Super / Parent / Base
  public int add(int i, int j) {
    return i + j;
  }
}

class AdvancedCalculator extends Calculator { // Sub / Child / Derived
  public int sub(int i, int j) {
    return i - j;
  }
}

class VeryAdvancedCalculator extends AdvancedCalculator { // IS-A
  public int mul(int i, int j) {
    return i * j;
  }
}

/**
 * Solving the multiple inheritence problem:- When implementing 2 interfaces
 * with same method name, there will be ambiguity. To solve this problem,
 * override the method in the child class
 */

public class InheritanceDemo {
  public static void main(String[] args) {
    VeryAdvancedCalculator c1 = new VeryAdvancedCalculator(); // HAS-A
    int result1 = c1.add(5, 4);
    int result2 = c1.sub(5, 4);
    int result3 = c1.mul(5, 4);

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
  }
}
