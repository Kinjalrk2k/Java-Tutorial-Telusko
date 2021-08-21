public class ArrayDemo {
  public static void main(String[] args) {
    int nums[] = { 8, 12, 76, 54 };

    for (int i : nums) {
      System.out.println(i);
    }

    int d[][] = { { 1, 2, 3, 4 }, { 2, 4, 8 }, { 5, 6, 7, 8, 9 } };

    for (int[] i : d) {
      for (int j : i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
