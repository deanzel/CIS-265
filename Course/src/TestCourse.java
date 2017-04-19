public class TestCourse {
  public static void main(String[] args) {
    //New two different courses Data Structure, Database systems
    Course course1 = new Course("Data Structure");
    Course course2 = new Course("Database systems");

    //Add three and two students to each course
    course1.addStudent("Dean Choi");
    course1.addStudent("Baller Broi");
    course1.addStudent("YOLO BRO");
    
    course2.addStudent("Deanzel");
    course2.addStudent("HALLO!!!");


    System.out.println("Number of students in course1: "
      + course1.getNumberOfStudents());
    String[] students = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(students[i] + ", ");

    System.out.println();
    System.out.print("Number of students in course2: "
      + course2.getNumberOfStudents());
  }
}