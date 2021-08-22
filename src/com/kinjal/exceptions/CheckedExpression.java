package com.kinjal.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classes that come from the java.io package, are resources. And we need to
 * close the resource after we're done using it (because it occupies the memory)
 */

public class CheckedExpression {
  /**
   * When the compiler knows about the exception, it forces us to handle it. This
   * is called checked exception. IOException is a checked expression, we should
   * handle it by using try-catch or using the throws keyword in the method!
   */
  public static void main(String[] args) throws IOException {
    System.out.println("Enter a number: ");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    System.out.println(n);

    br.close(); // good practice
  }
}
