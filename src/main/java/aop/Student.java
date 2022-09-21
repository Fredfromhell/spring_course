package aop;

public class Student {
    private  String nameSurname;
    private int course;
    private double AvgGrade;


    public Student(String nameSurname, int course, double avgGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        AvgGrade = avgGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return AvgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        AvgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", AvgGrade=" + AvgGrade +
                '}';
    }
}
