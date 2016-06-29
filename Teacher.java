package Proje;

/**
 * Created by karim on 27.06.2016.
 */
public class Teacher extends PersonalInformation{

    private int teacherOfficeNumber;
    private int teachingSubject;


    public Teacher(String name, String surname, String gender, String email, String nationality, String marialStatues, int age, String cellNumber, int teacherOfficeNumber, int teachingSubject) {
        super(name, surname, gender, email, nationality, marialStatues, age, cellNumber);
        this.teacherOfficeNumber = teacherOfficeNumber;
        this.teachingSubject = teachingSubject;

    }
}
