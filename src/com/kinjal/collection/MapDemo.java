package com.kinjal.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>(); // use HashTable for synchronized
    map.put("name", "Kinjal");
    map.put("age", "20");
    map.put("age", "21"); // over-writes

    System.out.println(map);

    System.out.println(map.get("name")); // if key not present = null

    Set<String> keys = map.keySet();
    for (String key : keys) {
      System.out.println(key + ": " + map.get(key));
    }
  }
}
