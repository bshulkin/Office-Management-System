public class doctor{
    
    protected String firstName = "";
    protected String lastName = "";
    protected String specialization = "";

class patient extends doctor{
    String firstName = "";
    String lastName = "";
}    

class assistant extends doctor{
    String firstName = "";
    String lastName = "";
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
    return lastName;
}

public void setSpecialization(String specialization){
    this.specialization = specialization;
}

public String name(){
    return String.format("%s %s \n", firstName, lastName);
}
}
