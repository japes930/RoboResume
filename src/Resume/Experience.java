package Resume;

public class Experience {
    private String compName, title, yrStart, yrEnd;
    private Duties duties;

    public Experience(){

    }

    public Experience(String compName, String title, String yrStart, String yrEnd){
        this.compName = compName;
        this.title = title;
        this.yrStart = yrStart;
        this.yrEnd = yrEnd;
//        this.duties= new Duties();//Q: Is this necessary?
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYrStart() {
        return yrStart;
    }

    public void setYrStart(String yrStart) {
        this.yrStart = yrStart;
    }

    public String getYrEnd() {
        return yrEnd;
    }

    public void setYrEnd(String yrEnd) {
        this.yrEnd = yrEnd;
    }

    public String toString(){
        return getTitle() + "\n" +  getCompName() + ", " + getYrStart() + " - " + getYrEnd();
    }
}

