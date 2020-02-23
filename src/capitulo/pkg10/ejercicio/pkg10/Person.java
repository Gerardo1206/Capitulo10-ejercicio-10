package capitulo.pkg10.ejercicio.pkg10;

public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private Integer zipCode;
    private String phoneNumer;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
    }

    
    public String display() {
        return "firstName=" + firstName + 
               "\nlastName=" + lastName + 
               "\nstreetAddress=" + streetAddress + 
               "\nzipCode=" + zipCode + 
               "\nphoneNumer=" + phoneNumer;
    }

}
