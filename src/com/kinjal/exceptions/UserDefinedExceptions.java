package com.kinjal.exceptions;

public class UserDefinedExceptions {
  public static void main(String[] args) {
    int i, j;
    i = 8;
    j = 9;

    try {
      int k = i / j;

      if (k == 0) {
        throw new ZeroExpection("Cannot do this!");
      }

      System.out.println(k);
    } catch (ZeroExpection e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
