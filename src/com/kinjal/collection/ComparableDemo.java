package com.kinjal.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
  int rollno, marks;
  String name;

  public Student(int rollno, String name, int marks) {
    this.rollno = rollno;
    this.marks = marks;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [marks=" + marks + ", name=" + name + ", rollno=" + rollno + "]";
  }

  @Override
  public int compareTo(Student o) {
    return this.marks > o.marks ? 1 : -1;
  }

}

public class ComparableDemo {
  public static void main(String[] args) {
    List<Student> studs = new ArrayList<>();

    studs.add(new Student(23, "Mahesh", 55));
    studs.add(new Student(24, "Sony", 64));
    studs.add(new Student(25, "Larry", 25));
    studs.add(new Student(26, "Joseph", 36));

    Collections.sort(studs);

    for (Student s : studs) {
      System.out.println(s);
    }
  }
}
