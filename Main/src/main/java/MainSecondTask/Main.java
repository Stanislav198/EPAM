package MainSecondTask;
public class Main {
    public static void main(String[] args) {

        Patient patient;
        Patients patients = new Patients();

        patient = new Patient();
        patient.setId();
        patient.setSurname("Pshanichny");
        patient.setName("Gerasim");
        patient.setPatronymic("Petrovich");
        patient.setNumberCard("45");
        patient.setIllness("Otravlenie");
        patient.setAddress("Stroitelei 24");
        patient.setTel("+375 (29) 86-48-757");
        patients.addPatient(patient);

        patients.addOtherPatients("Priluchni", "Ivan", "Stanislavovich", "44", "Psihoz", "Bagrationa 19", "+375 (56) 67-23-111");
        patients.addOtherPatients("Domovoi", "Boris", "Dmitrievich", "17", "Gripp", "Filimonova 11-2", "+375 (44) 68-47-753");
        patients.addOtherPatients("Zelenin", "Aleksey", "Aleksndrovich", "89", "Appendicit", "Yanki Luchini 9", "+375 (29) 31-28-657");
        patients.addOtherPatients("Karabach", "Anton", "Potapovich", "11", "Gripp", "Lenina 56", "+375 (33) 11-90-517");

        patients.searchForCard("40" , "50");
        patients.searchForIllness("Gripp");
    }
}