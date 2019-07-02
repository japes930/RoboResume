package Resume;

public class Skills {
    private String skill, proficiency;



    public Skills(){

    }

    public Skills(String skill, String proficiency){
        this.skill = skill;
        this.proficiency = proficiency;
    }


    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    @Override
    public String toString(){
        return (this.skill + " [" + this.proficiency+ "]");
    }

//    public void getSkills(){
//        if(skillsList.size()>0) {
//            System.out.println("SKILLS");
//            for(int i=0; i <skillsList.size(); i++) {
//                System.out.println(skillsList.get(i).toString());
//            }
//        }
//    }
}
