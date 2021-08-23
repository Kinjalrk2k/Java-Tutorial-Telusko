package com.kinjal.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {
    Set<Integer> values = new HashSet<>(); // use TreeSet for sorted set

    values.add(6);
    values.add(5);
    values.add(9);
    values.add(6); // add returns boolean.

    for (Integer o : values) {
      System.out.println(o);
    }
  }
}
