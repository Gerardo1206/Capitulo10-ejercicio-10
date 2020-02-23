package capitulo.pkg10.ejercicio.pkg10;

public class CollageEmployee extends Person {
    private String socialSecurityNumber;
    private Double annualSalary;
    private String deparmentName;

    @Override
    public String display() {
        return "CollageEmployee{"+super.display()+ 
                "\nsocialSecurityNumber=" + socialSecurityNumber + 
                "\nannualSalary=" + annualSalary + 
                "\ndeparmentName=" + deparmentName;
                }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getDeparmentName() {
        return deparmentName;
    }

    public void setDeparmentName(String deparmentName) {
        this.deparmentName = deparmentName;
    }
    
  }
