import java.util.Date;

public class Student{
    private String fname;
    private String lname;
    private String email;
    private String address;
    private String telNumber;
    private Date date;
    private String indexNumber;
    private static int count=1;
    private  String studentType = "kandydat";
    private int studentITNs = 0;

    private int currentSemester;
    private StudyProgramme studyProgramme;

    public Student(String fname, String lname, String email, String address, String telNumber, Date date) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
        this.telNumber = telNumber;
        this.date = date;
        indexNumber = "s" + count;
        count++;
        if (currentSemester == 0) {
            studentType = "kandydat";
        } else if (currentSemester >= 1 && currentSemester <= 7) {
            studentType = "student";
        } else {
            studentType = "absolwent";
        }
        Students.addStudents(this);
    }



    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", date=" + date +
                ", indexNumber='" + indexNumber + '\'' +
                ", count=" + count +
                ", grade=" + grade +
                ", lecture='" + lecture + '\'' +
                '}';
    }


    public int grade;
    String lecture;

    public void addGrade(int grade, String lecture) {
        this.grade = grade;
        this.lecture = lecture;
    }

    public void enrollStudent(StudyProgramme studyprogramme) {
        if ( currentSemester == 0) {
            studentType = "Student";
            currentSemester = 1;
            this.studyProgramme = studyprogramme;
        }
    }
    public void promoteToNextSemester(Student student){
        if( studentITNs <= studyProgramme.getItnQuantity()){
            currentSemester++;
            if (currentSemester == 0) {
                studentType = "kandydat";
            } else if (currentSemester >= 1 && currentSemester <= 7) {
                studentType = "student";
            } else {
                studentType = "absolwent";
            }
        }
    }


}