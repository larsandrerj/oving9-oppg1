public class Student {
  private final String name;
  private int numberOfAssignments = 0;
  public Student(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public int getNumberOfAssignments() {
    return numberOfAssignments;
  }
  public void addAssignments(int numberOfAssignments) {
    this.numberOfAssignments += numberOfAssignments;
  }
  public String toString() {
    return name + " has " + numberOfAssignments + " assignments";
  }
}
