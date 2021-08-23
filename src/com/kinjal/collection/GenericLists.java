package com.kinjal.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericLists {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>();

    values.add(4);
    values.add(9);
    values.add(6);
    values.add(1, 2);

    for (int i = 0; i < values.size(); i++) {
      System.out.println(values.get(i));
    }

    for (Integer o : values) {
      System.out.println(o);
    }
  }
}
