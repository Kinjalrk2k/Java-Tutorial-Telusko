class Calc {
  public static int add(int... n) {
    int sum = 0;

    for (int i : n) {
      sum += i;
    }

    return sum;
  }
}

public class VarargsDemo {
  public static void main(String[] args) {
    System.out.println(Calc.add(1, 2, 3, 4, 5));
    System.out.println(Calc.add(1, 2, 3));
  }
}
