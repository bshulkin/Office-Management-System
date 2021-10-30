public class patient extends person {
    private doctor doctor;
    
        public patient(String fName, String lName, doctor doctor) {
            super(fName, lName);
            this.doctor = doctor;
        }
        public String toString(){
            return String.format("First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Doctor Assigned: " + doctor.firstName + " " + doctor.lastName);
        }

}
