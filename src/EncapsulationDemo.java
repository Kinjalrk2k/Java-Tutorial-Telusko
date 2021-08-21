class Student {
  private int rollno;
  private String name;

  // getters and setters (encapsulating)

  public int getRollno() {
    return rollno;
  }

  public void setRollno(int rollno) {
    this.rollno = rollno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class EncapsulationDemo {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.setName("Kinjal");
    s1.setRollno(21);

    System.out.println(s1.getName() + " " + s1.getRollno());
  }
}
