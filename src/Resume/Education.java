package Resume;


import java.util.ArrayList;

public class Education {
    private String school, degree, major;
    private int year;
    public ArrayList<String> eduList;
    public Education(){

    };
    public Education(String school,  String major, String degree, int year) {
        this.school = school;
        this.degree = degree;
        this.major = major;
        this.year = year;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {

        this.school = school;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return (this.major + ", " + this.degree + "\n" +
                this.school + " " + this.year);
    }
}
