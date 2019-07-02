package Resume;
import java.util.ArrayList;

public class Resume {
    private String name, email, phoneNum;
    private Education education;
    private Skills skills;
    private Experience experience;

    public Resume(
            String name, String email, String phoneNum){
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.education = new Education();
//        this.experience = new Experience
//        this.skills = new Skills();

    }


    public String toString(){
        return this.name +
                "\nEmail: " + this.email +
                "\nPhone Number: " + this.phoneNum;
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
