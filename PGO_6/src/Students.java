import java.util.ArrayList;
import java.util.List;

public class Students {
    public static List<Student> students=new ArrayList<>();

    public static void addStudents(Student student) {

        students.add(student);
    }
    public static void promoteAllStudents() {
        for(Student student : students){
            student.promoteToNextSemester(student);
        }
    }
    public static void displayInfoAboutAllStudents() {
        System.out.println(students);
    }
}

