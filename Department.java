package Proje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by karim on 27.06.2016.
 */
public class Department  {

    private String name;
    private ArrayList<String> studentAdded=new ArrayList<>();
    private ArrayList<String> teacherAdded=new ArrayList<>();
    private ArrayList<String> personellAdded=new ArrayList<>();
    private List<String> classAvailables=new ArrayList<>();
    private int studentCount;
    private int teacherCount;
    private int personellCount;

    public void setName(String name) {this.name = name;}
    public void setStudentAdded(ArrayList<String> studentAdded) {this.studentAdded = studentAdded;}
    public void setTeacherAdded(ArrayList<String> teacherAdded) {this.teacherAdded = teacherAdded;}
    public void setPersonellAdded(ArrayList<String> personellAdded) {this.personellAdded = personellAdded;}
    public void setClassAvailables(List<String> classAvailables) {this.classAvailables = classAvailables;}
    public void setStudentCount(int studentCount) {this.studentCount = studentCount;}
    public void setTeacherCount(int teacherCount) {this.teacherCount = teacherCount;}
    public void setPersonellCount(int personellCount) {
        this.personellCount = personellCount;
    }
    public String getName() {
        return name;
    }
    public ArrayList<String> getClassAvailables() {
        return classAvailables;
    }
    public int getStudentCount() {
        return studentCount;
    }
    public int getTeacherCount() {
        return teacherCount;
    }
    public int getPersonellCount() {
        return personellCount;
    }
    public ArrayList<String> getEmployeeAdded() {
        return personellAdded;
    }
    public ArrayList<String> getStudentAdded() {
        return studentAdded;
    }
    public ArrayList<String> getTeacherAdded() {
        return teacherAdded;
    }



    public Department(String name, int studentCount, int teacherCount, int personellCount) {
        setName(name);
        setStudentCount(studentCount);
        setTeacherCount(teacherCount);
        setPersonellCount(personellCount);
    }

    void addStudent(Student object) {
        studentAdded.add(object.getName());
        System.out.println(object.getName()+" has been added successfully ");
    }
    void deleteStudent(Student object) {
        studentAdded.remove(object.getName());
        System.out.println(object.getName()+" has been deleted successfully ");
    }
    void addTeacher(Teacher object) {
        teacherAdded.add(object.getName());
        System.out.println(object.getName()+" has been added successfully ");
    }
    void deleteTeacher(Teacher object) {
        teacherAdded.add(object.getName());
        System.out.println(object.getName()+" has been deleted successfully ");
    }
    void addPersonnel(Personnel object) {
        personellAdded.add(object.getName());
        System.out.println(object.getName()+" has been added successfully ");
    }
    void deletePersonnel(Personnel object)
    {
        personellAdded.remove(object.getName());
        System.out.println(object.getName()+" has been deleted successfully ");
    }
    void addClass (String className){
        classAvailables.add(className);
    }


}






