package com.kinjal.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryResource {
  public static void main(String[] args) throws IOException {
    int n;

    System.out.println("Enter a number");

    // OLD STYLE (Aam Zindegi)
    // BufferedReader br = null;
    // try {
    // br = new BufferedReader(new InputStreamReader(System.in));
    // n = Integer.parseInt(br.readLine());
    // } finally {
    // br.close();
    // }

    // NEW STYLE (Mentos Zindegi)
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      // when goes out of scope, the resource is automatically closed
      n = Integer.parseInt(br.readLine());
    }
  }
}
