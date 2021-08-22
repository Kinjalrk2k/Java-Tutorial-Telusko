package com.kinjal.exceptions;

public class ExceptionDemo {
  public static void main(String[] args) {
    try {
      int i = 9 / 0;
      int a[] = new int[6];

      System.out.println(a[6]);
    }
    // catch (Exception e) {
    // System.out.println("Error");
    // }
    catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
      // multiple exceptions in 1 catch is possible in >= Java 7
      System.out.println("Error");
    } finally {
      System.out.println("Bye");
    }
  }
}
