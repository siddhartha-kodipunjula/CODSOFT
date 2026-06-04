import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static void saveStudents(ArrayList<Student> students) {

        try {

            try (FileWriter writer = new FileWriter("students.txt")) {
                for (Student student : students) {
                    
                    writer.write(
                            student.getStudentId() + "," +
                                    student.getName() + "," +
                                    student.getAge() + "," +
                                    student.getCourse() + "," +
                                    student.getGrade() + "\n");
                }
            }

            System.out.println(
                    "Student Data Saved Successfully");

        } catch (IOException e) {

            System.out.println(
                    "Error Saving Student Data");
        }
    }
}