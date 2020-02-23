package capitulo.pkg10.ejercicio.pkg10;

public class Student extends Person {
    private String major;
    private Double gradePoint;

    @Override
    public String display() {
        return "Student: "+super.display()+
                "\nmajor:"+major+
                "\ngrade point"+gradePoint; 
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Double getGradePoint() {
        return gradePoint;
    }

    public void setGradePoint(Double gradePoint) {
        this.gradePoint = gradePoint;
    }
    
}
