
public class doctor extends person{
    String specialization;

    public doctor(String fName, String lName, String specialization) {
        super(fName, lName);
        this.specialization = specialization;
    }

    public String toString(){
        return String.format("First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Specialization: " + specialization);
    }
}
    
    