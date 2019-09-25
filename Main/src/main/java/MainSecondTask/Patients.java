package MainSecondTask;

import java.util.*;

public class Patients {

    private List<Patient> patients;
    public Patients() {
        patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addOtherPatients(String surname, String name, String patronymic, String numberCard, String illness, String address, String tel) {
        Patient patient = new Patient(surname, name, patronymic, numberCard, illness, address, tel);
        patient.setId();
        patients.add(patient);
    }

    public void searchForIllness(String illness) {
        for (int i = 0; i < patients.size(); i++) {
            if (illness == patients.get(i).getIllness()) {
                System.out.println("           Gripp");
                patients.get(i).printPatient();
            }
        }
    }

    public void searchForCard(String cardFrom, String cardTo) {
        for (int i = 0; i < patients.size(); i++) {
            if ((patients.get(i).getNumberCard().compareTo(cardFrom) >= 0 && patients.get(i).getNumberCard().compareTo(cardTo) <= 0)) {
                System.out.println("           Card 40-50");
                patients.get(i).printPatient();
            }
        }
    }
}