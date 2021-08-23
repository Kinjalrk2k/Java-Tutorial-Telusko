package com.kinjal.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    List values = new ArrayList();

    values.add(4);
    values.add(6);
    values.add(9);
    values.add(1, 2);

    for (int i = 0; i < values.size(); i++) {
      System.out.println(values.get(i));
    }

    for (Object o : values) {
      System.out.println(o);
    }
  }
}
