import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            StudentManager manager =
                    new StudentManager();
            
            int choice;
            
            do {
                
                System.out.println("\n==============================");
                System.out.println(" STUDENT MANAGEMENT SYSTEM");
                System.out.println("==============================");
                
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student");
                System.out.println("5. Remove Student");
                System.out.println("6. Save Data");
                System.out.println("7. Exit");
                
                System.out.print("Enter Choice: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    
                    case 1:
                        
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        
                        sc.nextLine();
                        
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        
                        sc.nextLine();
                        
                        System.out.print("Enter Course: ");
                        String course = sc.nextLine();
                        
                        System.out.print("Enter Grade: ");
                        String grade = sc.nextLine();
                        
                        manager.addStudent(
                                new Student(
                                        id,
                                        name,
                                        age,
                                        course,
                                        grade));
                        
                        break;
                        
                    case 2:
                        
                        manager.displayStudents();
                        break;
                        
                    case 3:
                        
                        System.out.print(
                                "Enter Student ID: ");
                        
                        manager.searchStudent(
                                sc.nextInt());
                        
                        break;
                        
                    case 4:
                        
                        System.out.print(
                                "Enter Student ID: ");
                        
                        int updateId =
                                sc.nextInt();
                        
                        sc.nextLine();
                        
                        System.out.print(
                                "Enter New Name: ");
                        
                        String newName =
                                sc.nextLine();
                        
                        System.out.print(
                                "Enter New Age: ");
                        
                        int newAge =
                                sc.nextInt();
                        
                        sc.nextLine();
                        
                        System.out.print(
                                "Enter New Course: ");
                        
                        String newCourse =
                                sc.nextLine();
                        
                        System.out.print(
                                "Enter New Grade: ");
                        
                        String newGrade =
                                sc.nextLine();
                        
                        manager.updateStudent(
                                updateId,
                                newName,
                                newAge,
                                newCourse,
                                newGrade);
                        
                        break;
                        
                    case 5:
                        
                        System.out.print(
                                "Enter Student ID: ");
                        
                        manager.removeStudent(
                                sc.nextInt());
                        
                        break;
                        
                    case 6:
                        
                        FileManager.saveStudents(
                                manager.getStudents());
                        
                        break;
                        
                    case 7:
                        
                        System.out.println(
                                "Thank You");
                        
                        break;
                        
                    default:
                        
                        System.out.println(
                                "Invalid Choice");
                }
                
            } while (choice != 7);
        }
    }
}
