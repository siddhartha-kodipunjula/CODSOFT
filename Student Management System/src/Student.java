public class Student {

    private final int studentId;
    private String name;
    private int age;
    private String course;
    private String grade;

    public Student(int studentId,
                   String name,
                   int age,
                   String course,
                   String grade) {

        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void displayStudent() {

        System.out.println(
                studentId + " | "
                        + name + " | "
                        + age + " | "
                        + course + " | "
                        + grade);
    }
}