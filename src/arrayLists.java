import java.util.ArrayList;

public class arrayLists {
    private ArrayList<doctor> doctorsList;
    private ArrayList<patient> patientsList;
    private ArrayList<assistant> assistantsList;
    private ArrayList<services> servicesList;

    public void ArrayLists(){
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

}