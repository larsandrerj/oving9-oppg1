import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("ØVING 9 OPPG 1");
    AssignmentOverview assignmentOverview = new AssignmentOverview();

    boolean exit = false;
    while (!exit) {
      menu();
      int userInput = new Scanner(System.in).nextInt();
      switch (userInput) {
        case 1:
          System.out.println("Student navn:");
          assignmentOverview.addStudent(new Scanner(System.in).nextLine());
          break;
        case 2:
          System.out.println("Hvilken student");
          String name = new Scanner(System.in).nextLine();

          System.out.println("Hvor mange oppgaver");
          int numberOfAssignments = new Scanner(System.in).nextInt();
          assignmentOverview.addAssignment(name, numberOfAssignments);
          break;
        case 3:
          System.out.println(assignmentOverview.toString());
          break;
        case 4:
          System.out.println("Hvilken student?");
          System.out.println(assignmentOverview.getAssignmentsToStudent(new Scanner(System.in).nextLine()));
          break;
        case 5:
          exit = true;
          break;
        default:
          exit = true;
          break;
      }
    }
  }
  public static void menu() {
    System.out.println("1. Legg til student");
    System.out.println("2. Legg til oppgaver til student");
    System.out.println("3. Skriv ut alle studenter");
    System.out.println("4. Skriv ut antall oppgaver til student");
    System.out.println("5. Avslutt");
  }
}