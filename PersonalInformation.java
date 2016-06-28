package Proje;

/**
 * Created by karim on 27.06.2016.
 */
public abstract class PersonalInformation {

    private String name;
    private String surname;
    private String gender;
    private String email;
    private String nationality;
    private String marialStatue;
    private String cellNumber;
    private int age;

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getGender() {
        return gender;
    }
    public String getEmail() {
        return email;
    }
    public String getNationality() {
        return nationality;
    }
    public String getMarialStatue() {
        return marialStatue;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void setMarialStatue(String marialStatue) {
        this.marialStatue = marialStatue;
    }
    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCellNumber() {

        return cellNumber;
    }
    public int getAge() {
        return age;
    }


    public PersonalInformation(String name, String surname, String gender, String email, String nationality, String marialStatue, int age, String cellNumber) {
        setName(name);
        setSurname(surname);
        setGender(gender);
        setEmail(email);
        setNationality(nationality);
        setMarialStatue(marialStatue);
        setAge(age);
        setCellNumber(cellNumber);
    }

}
