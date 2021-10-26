public class doctor{
    
    protected String firstName;
    protected String lastName;
    protected String specialization;

    doctor(String firstName, String lastName, String specialization){
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
    }

class patient extends doctor{

    patient(String firstName, String lastName, String doctor) {
        super(firstName, lastName, doctor);
        //TODO Auto-generated constructor stub
    }
    void specialization(){}
}    

class assistant extends doctor{
    assistant(String firstName, String lastName, String doctor) {
        super(firstName, lastName, doctor);
        //TODO Auto-generated constructor stub
    }
    void specialization(){}
}   

public String getFirstName(){
    return firstName;
}

public void setFirstName(String firstName){
    this.firstName = firstName;
}

public String getLastName(){
    return lastName;
}

public void setLastName(String lastName){
    this.lastName = lastName;
}

public String getSpecialization(){
    return specialization;
}

public void setSpecialization(String specialization){
    this.specialization = specialization;
}

public String name(){
    return String.format("%s %s \n", firstName, lastName);
}

doctor Bryan = new doctor("Bryan", "Shulkin", "Pediatrics");
doctor Ben = new doctor("Ben", "Perkins", "Surgeon");
doctor Daniel = new doctor("Daniel", "Dolensky", "Orthopedist");

patient Jessica = new patient("Jessica", "Kelley", "Bryan Shulkin");

}
