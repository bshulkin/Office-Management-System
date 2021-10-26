public class doctor{
    
    protected String doctorFirstName;
    protected String doctorLastName;
    protected static String doctorSpecialization;

    doctor(String doctorFirstName, String doctorLastName, String doctorSpecialization){
        this.doctorFirstName = doctorFirstName;
        this.doctorLastName = doctorLastName;
        doctor.doctorSpecialization = doctorSpecialization;
    }

class patient extends doctor{

    private String firstName;
    private String lasName;
    patient(String firstName, String lastName, String doctorFirstName, String doctorLastName) {
      super(doctorFirstName, doctorLastName, doctorSpecialization);
      this.firstName =  firstName;
      this.lasName = lastName;
    }
    void doctorSpecialization(){}
}    

class assistant extends doctor{
    private String firstName;
    private String lasName;
    assistant(String firstName, String lastName, String doctorFirstName, String doctorLastName) {
      super(doctorFirstName, doctorLastName, doctorSpecialization);
      this.firstName =  firstName;
      this.lasName = lastName;
    
    }
    void doctorSpecialization(){}
}   

public String getFirstName(){
    return doctorFirstName;
}

public void setFirstName(String doctorFirstName){
    this.doctorFirstName = doctorFirstName;
}

public String getLastName(){
    return doctorLastName;
}

public void setLastName(String doctorLastName){
    this.doctorLastName = doctorLastName;
}

public String getSpecialization(){
    return doctorSpecialization;
}

public void setSpecialization(String specialization){
    this.doctorSpecialization = doctorSpecialization;
}

public String name(){
    return String.format("%s %s \n", doctorFirstName, doctorLastName);
}

doctor Bryan = new doctor("Bryan", "Shulkin", "Pediatrics");
doctor Ben = new doctor("Ben", "Perkins", "Surgeon");
doctor Daniel = new doctor("Daniel", "Dolensky", "Orthopedist");

patient Jessica = new patient("Jessica", "Kelley", Bryan.doctorFirstName, Bryan.doctorLastName);
patient Morgan = new patient("Morgan", "Money", Ben.doctorFirstName, Ben.doctorLastName);
patient Evan = new patient("Evan", "Ashburn", Daniel.doctorFirstName, Daniel.doctorLastName);

assistant Jane = new assistant("Jane", "Doe", doctorFirstName, doctorLastName);
assistant Brenda = new assistant("Brenda", "Borders", doctorFirstName, doctorLastName);
assistant Billy = new assistant("Billy", "Bob", doctorFirstName, doctorLastName);


}
