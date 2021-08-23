package com.kinjal.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>(); // mutable

    values.add(404);
    values.add(908);
    values.add(639);
    values.add(256);

    Comparator<Integer> c = (o1, o2) -> o1 % 10 > o2 % 10 ? 1 : -1;

    // 2nd one is the comparator
    Collections.sort(values, c);

    for (Integer o : values) {
      System.out.println(o);
    }
  }
}
