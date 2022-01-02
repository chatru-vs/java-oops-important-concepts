package oops;

public class StudentBuilder {
    private int i;
    private String studentName;
    private String studentCity;

    public StudentBuilder setI(int i) {
        this.i = i;
        return this;
    }

    public StudentBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public StudentBuilder setStudentCity(String studentCity) {
        this.studentCity = studentCity;
        return this;
    }

    public Student createStudent() {
        return new Student();
    }
}