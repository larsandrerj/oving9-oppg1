public class StudentTest {
  public static void main(String[] args) {
    // Create a new student
    Student student = new Student("John");

    // Display the initial information
    System.out.println(student);

    // Add assignments
    student.addAssignments(5);

    // Display updated information
    System.out.println(student);

    // Get and display the number of assignments
    int numberOfAssignments = student.getNumberOfAssignments();
    System.out.println(student.getName() + " has " + numberOfAssignments + " assignments");
  }
}
