
public class StudyProgramme {
    private String studyType;
    private String studentGroup;
    private int semesters;
    private int itnQuantity;



    public StudyProgramme(String studyType, String studentGroup, int semesters, int itnQuantity) {
        this.studyType = studyType;
        this.studentGroup = studentGroup;
        this.semesters = semesters;
        this.itnQuantity = itnQuantity;

    }



    public int getItnQuantity() {
        return itnQuantity;
    }
}

