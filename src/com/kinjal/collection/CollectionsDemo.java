package com.kinjal.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>(); // mutable

    values.add(404);
    values.add(908);
    values.add(639);
    values.add(256);

    Collections.sort(values); // Collections class not Collection Interface
    Collections.reverse(values);
    Collections.shuffle(values);

    for (Integer o : values) {
      System.out.println(o);
    }
  }
}
