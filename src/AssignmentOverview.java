import java.util.ArrayList;

public class AssignmentOverview {
  private ArrayList<Student> students = new ArrayList<Student>();
  private int numberOfStudents = students.size();
  private int getNumberOfStudents() {
    return numberOfStudents;
  }
  public int getAssignmentsToStudent(String name) {
    for (Student student : students) {
      if (student.getName().equals(name)) {
        return student.getNumberOfAssignments();
      }
    }
    return 0;
  }

  public void addStudent(String name) {
    students.add(new Student(name));
  }
  public void addAssignment(String name, int numberOfAssignments) {
    for (Student student : students) {
      if (student.getName().equals(name)) {
        student.addAssignments(numberOfAssignments);
      }
    }
  }
  public String toString() {
    StringBuilder output = new StringBuilder();
    for (Student student : students) {
      output.append(student.toString()).append("\n");
    }
    return output.toString();
  }

}
