package com.kinjal.threading;

public class LambdaExpressions {
  public static void main(String[] args) throws InterruptedException {
    // Runnable obj1 = () -> {
    // for (int i = 0; i < 5; i++) {
    // System.out.println("Hi");
    // try {
    // Thread.sleep(500);
    // } catch (Exception e) {
    // }
    // }
    // };

    // Runnable obj2 = () -> {
    // for (int i = 0; i < 5; i++) {
    // System.out.println("Hello");
    // try {
    // Thread.sleep(500);
    // } catch (Exception e) {
    // }
    // }
    // };

    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("Hi");
        try {
          Thread.sleep(500);
        } catch (Exception e) {
        }
      }
    }, "Hi Thread");

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("Hello");
        try {
          Thread.sleep(500);
        } catch (Exception e) {
        }
      }
    }, "Hello Thread");

    // t1.setName("Hi");
    // t2.setName("Hello");
    System.out.println(t1.getName());
    System.out.println(t2.getName());

    t1.setPriority(Thread.MIN_PRIORITY);
    t1.setPriority(Thread.MAX_PRIORITY);
    System.out.println(t1.getPriority());
    System.out.println(t2.getPriority());

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(t1.isAlive());

    System.out.println("Bye");
  }
}
