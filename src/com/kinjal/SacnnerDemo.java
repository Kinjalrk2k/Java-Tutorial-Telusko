package com.kinjal;

import java.util.Scanner;

public class SacnnerDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    int n = sc.nextInt();
    System.out.println(n);

    // 1. Need not convert atring to integer
    // 2. Need not handle exceptions
  }
}
