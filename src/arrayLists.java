import java.util.ArrayList;

public class arrayLists {
    static ArrayList<doctor> doctorsList;
    private ArrayList<patient> patientsList;
    private ArrayList<assistant> assistantsList;
    private ArrayList<services> servicesList;

    public arrayLists(){
        doctorsList = new ArrayList<>();
        patientsList = new ArrayList<>();
        assistantsList = new ArrayList<>();
        servicesList = new ArrayList<>();
    }

    public void addDoctor(doctor newDoctor){
        doctorsList.add(newDoctor);
    }

    public void addPatient(patient newPatient){
        patientsList.add(newPatient);
    }

    public void addAssistant(assistant newAssistant){
        assistantsList.add(newAssistant);
    }

    public void addService(services newService){
        servicesList.add(newService);
    }
    public ArrayList<doctor> getDoctors(){
        return doctorsList;
    }

    public ArrayList<patient>getPatients(){
        return patientsList;
    }
    public ArrayList<assistant>getAssistants(){
        return assistantsList;
    }
    public ArrayList<services>getServices(){
        return servicesList;
    }
    public void setDoctor(ArrayList values){
        this.doctorsList = values;
    }
    public void setPatient(ArrayList patientList){
        this.patientsList = patientList;
    }
    public void setAssistant(ArrayList values){
        this.assistantsList = values;
    }
    public void setServices(ArrayList values){
        this.servicesList = values;
    }




}