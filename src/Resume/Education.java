package Resume;


import java.util.ArrayList;

public class Education {
    private String school, degree, major;
    private String year;
//    public ArrayList<String> eduList;
    public Education(){

    };
    public Education(String school,  String major, String degree, String year) {
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString(){

//        if(eduList.size()>0) {
////            System.out.println("EDUCATION");
////            for(int i=0; i <eduList.size(); i++) {
////                System.out.println(eduList.get(i).toString());
////                System.out.println();
////            }
////        }
        return (this.major + ", " + this.degree + "\n" +
                this.school + " " + this.year);
    }
}
