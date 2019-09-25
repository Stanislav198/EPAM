package MainSecondTask;

public class Patient {

    private int id;
    private static int count = 1;
    private String surname;
    private String name;
    private String patronymic;
    private String numberCard;
    private String illness;
    private String address;
    private String tel;

    public Patient() {}
    public Patient(String surname, String name, String patronymic, String numberCard, String illness, String address, String tel) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.numberCard = numberCard;
        this.illness = illness;
        this.address = address;
        this.tel = tel;
    }

    public void setSurname(String surname) { this.surname = surname; }
    public void setName(String name) { this.name = name; }
    public void setPatronymic(String patronymic) { this.patronymic = patronymic;}
    public void setId() { id = count; count++; }
    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public void setIllness(String illness) {
        this.illness = illness;
    }
    public String getNumberCard() {
        return numberCard;
    }
    public String getIllness() {
        return illness;
    }
    public String toString() {
        return "******************************\n" + id + "* " + surname + " " + name + " " + patronymic + " \n   NumberCard : " + numberCard + "\n   Illness : " + illness + "\n   Address : " + address + "\n   Tel : " + tel+ "\n******************************" ;
    }

    public void printPatient() {
        System.out.println(toString());
    }
}