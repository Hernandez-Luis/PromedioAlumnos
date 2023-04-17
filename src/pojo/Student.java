package pojo;

public class Student extends Person {
    public Subject [] subjects;
    private String idStudent;
    public int grade;
    private String collegeCareer;

    //Constructores de la clase
    public Student() {
        super();
    }

    public Student(String idStudent, String name, String lastName, String gender, int age, int grade, String collegeCareer) {
        super(name, lastName, gender, age);
        this.idStudent = idStudent;
        this.grade = grade;
        this.collegeCareer = collegeCareer;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setCollegeCareer(String collegeCareer) {
        this.collegeCareer = collegeCareer;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public int getGrade() {
        return grade;
    }

    public String getCollegeCareer() {
        return collegeCareer;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Id: " + idStudent
                + super.toString()
                + " Matricula: " + grade
                + " Carrera: " + collegeCareer;
    }
}
