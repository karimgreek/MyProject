package Proje;

/**
 * Created by karim on 27.06.2016.
 */
public class Student extends PersonalInformation{

    private int studentNumber;
    private int studentClass;

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }
    public int getStudentNumber() {
        return studentNumber;
    }
    public int getStudentClass() {
        return studentClass;
    }


    public Student(String name, String surname, String gender, String email, String nationality, String marialStatues, int age, String cellNumber, int studentNumber, int studentClass) {
        super(name, surname, gender, email, nationality, marialStatues, age, cellNumber);
       setStudentNumber(studentNumber);
        setStudentClass(studentClass);
    }

    int computeAverage(int sumOfCredits, int sumOfGrades){
        return (sumOfGrades*sumOfCredits)/sumOfCredits;
    }


}




