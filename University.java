package Proje;


import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by karim on 27.06.2016.
 */
public class University {


    private String name;
    private String address;
    private String dateOfEtablishement;
    private List departementAdded=new ArrayList();
    private int studentCount;
    private int teacherCount;
    private int personnelCount;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDateOfEtablishement() {
        return dateOfEtablishement;
    }
    public void setDateOfEtablishement(String dateOfEtablishement) {
        this.dateOfEtablishement = dateOfEtablishement;
    }
    public List  getDepartementAdded() {
        return departementAdded;
    }
    public void setDepartementAdded(List departementAdded) {
        this.departementAdded = departementAdded;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }
    public int getTeacherCount() {
        return teacherCount;
    }
    public void setTeacherCount(int teacherCount) {
        this.teacherCount = teacherCount;
    }
    public int getPersonnelCount() {
        return personnelCount;
    }
    public void setPersonnelCount(int personnelCount) {
        this.personnelCount = personnelCount;
    }



    public University(String name, String address, String dateOfEtablishement, int studentCount, int teacherCount, int personnelCount) {
        setName(name);
        setAddress(address);
        setDateOfEtablishement(dateOfEtablishement);
        setStudentCount(studentCount);
        setTeacherCount(teacherCount);
        setPersonnelCount(personnelCount);
    }

    void addDepartment(Department object){
        departementAdded.add(object.getName());
        System.out.println(object.getName()+" has been successfully added ");
    }
    void deleteDepartment(Department object){
        departementAdded.remove(object.getName());
        System.out.println(object.getName()+" has been successfully deleted ");
    }
    void displayDepartment(){
        System.out.println(departementAdded);
    };

}








