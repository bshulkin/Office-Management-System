import java.util.*;

public class App {
    //this does nothing not sure why
    public static void menu(services services){
        System.out.println("*********** Our Services ***********");
        System.out.println("ID" + "\t\t" + "Name" + "\t\t" + "Price");
        System.out.println(arrayLists.getServices());
    }
    public static void main(String[] args) throws Exception {
        
        //doctor arrayList
        arrayLists addDoctorsList = new arrayLists();
        doctor Bryan = new doctor("Bryan", "Shulkin", "Surgeon");
        doctor Daniel = new doctor("Daniel", "Dolensky", "Physcial Therapist");
        doctor Ben = new doctor("Ben", "Perkins", "Neurology");
        addDoctorsList.addDoctor(Bryan);
        addDoctorsList.addDoctor(Daniel);
        addDoctorsList.addDoctor(Ben);
        //assistant arrayList
        arrayLists addAssistantList = new arrayLists();
        assistant Bob = new assistant("Bob", "Barker", Bryan);
        assistant Dillon = new assistant("Dillon", "Parker", Daniel);
        assistant Jake = new assistant("Jake", "Pool", Ben);
        addAssistantList.addAssistant(Bob);
        addAssistantList.addAssistant(Dillon);
        addAssistantList.addAssistant(Jake);
        //patient arrayList
        arrayLists addPatientList = new arrayLists();
        patient Nathan = new patient("Nathan", "Shulkin", Bryan);
        patient Joshua = new patient("Joshua", "Shulkin", Daniel);
        patient David = new patient("David", "Shulkin", Ben);
        addPatientList.addPatient(Nathan);
        addPatientList.addPatient(Joshua);
        addPatientList.addPatient(David);

        arrayLists addServiceLists = new arrayLists();
        services surgery = new services(001, "Surgery", 1000);
        services physical = new services(002, "Physical", 200);
        services brain_scan = new services(003, "Brain Scan", 5000);
        services checkup = new services(004, "Check up", 1000);
        services flu_shot = new services(005, "Flu Shot", 50);
        addServiceLists.addService(surgery);
        addServiceLists.addService(physical);
        addServiceLists.addService(brain_scan);
        addServiceLists.addService(checkup);
        addServiceLists.addService(flu_shot);

        System.out.println(arrayLists.getServices());

    }
}
