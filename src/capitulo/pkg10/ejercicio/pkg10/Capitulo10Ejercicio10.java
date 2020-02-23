package capitulo.pkg10.ejercicio.pkg10;

public class Capitulo10Ejercicio10 {

    public static void main(String[] args) {
        String name="Jose";
        String lastname="Sanchez";
        String address="av ferrocarril";
        Integer zipcode=69100;
        String phonenumber="9512263474";
        String socialseguritynumber="5562";
        Double annualsalary=15000.00;
        String deparmentname="aseo";
        Boolean tenured=false;
        Double gradepoint=9.5;
        String major="derecho";
        Person p1=new Person();
        CollageEmployee p2=new CollageEmployee();
        Faculty p3=new Faculty();
        Student p4=new Student();
        p1.setFirstName(name);
        p1.setLastName(lastname);
        p1.setPhoneNumer(phonenumber);
        p1.setStreetAddress(address);
        p1.setZipCode(zipcode);
        p1.setPhoneNumer(phonenumber);
        p2.setFirstName(name);
        p2.setLastName(lastname);
        p2.setPhoneNumer(phonenumber);
        p2.setStreetAddress(address);
        p2.setZipCode(zipcode);
        p2.setPhoneNumer(phonenumber);
        p2.setAnnualSalary(annualsalary);
        p2.setDeparmentName(deparmentname);
        p2.setSocialSecurityNumber(socialseguritynumber);
        p3.setFirstName(name);
        p3.setLastName(lastname);
        p3.setPhoneNumer(phonenumber);
        p3.setStreetAddress(address);
        p3.setZipCode(zipcode);
        p3.setPhoneNumer(phonenumber);
        p3.setAnnualSalary(annualsalary);
        p3.setDeparmentName(deparmentname);
        p3.setSocialSecurityNumber(socialseguritynumber);
        p3.setTenured(tenured);
        p4.setGradePoint(gradepoint);
        p4.setFirstName(name);
        p4.setLastName(lastname);
        p4.setMajor(major);
        p4.setPhoneNumer(phonenumber);
        p4.setStreetAddress(address);
        p4.setZipCode(zipcode);
        p4.setPhoneNumer(phonenumber);
        System.out.println(p4.display());
        System.out.println("\n");
        System.out.println(p3.display());
        System.out.println("\n");
        System.out.println(p2.display());
        System.out.println("\n");
        System.out.println(p1.display());
    }
    
}
