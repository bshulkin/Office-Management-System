public class patient extends person {
    private doctor doctor;
    
        public patient(String fName, String lName, doctor doctor) {
            super(fName, lName);
            this.doctor = doctor;
}
}
