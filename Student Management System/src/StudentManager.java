import java.util.ArrayList;

public class StudentManager {

    private final ArrayList<Student> students;

    public StudentManager() {

        students = new ArrayList<>();
    }

    public void addStudent(Student student) {

        students.add(student);

        System.out.println(
                "Student Added Successfully!");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println(
                    "No Student Records Found");
            return;
        }

        System.out.println(
                "\nID | Name | Age | Course | Grade");

        for (Student student : students) {
            student.displayStudent();
        }
    }

    public void searchStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                System.out.println("\nStudent Found");
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    public ArrayList<Student> getStudents() {

        return students;
    }
    public void updateStudent(int studentId,
                          String name,
                          int age,
                          String course,
                          String grade) {

    for (Student student : students) {

        if (student.getStudentId() == studentId) {

            student.setName(name);
            student.setAge(age);
            student.setCourse(course);
            student.setGrade(grade);

            System.out.println(
                    "Student Updated Successfully");

            return;
        }
    }

    System.out.println(
            "Student Not Found");
}
}