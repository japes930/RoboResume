package Resume;

public class Duties {
    private String duty;

    public Duties(){

    }
    public Duties(String duty){
        this.duty = "-" + duty;
    }

    public String toString(){
        return this.duty;
    }

    public void setDuty(String duty){
        this.duty = duty;
    }

    public String getDuty(){
        return duty;
    }

}
