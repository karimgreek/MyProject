package Proje;


import java.util.ArrayList;

/**
 * Created by karim on 27.06.2016.
 */
public class MainClass {

    public static void main(String[] args) {
        University gaziuniversity= new University("Gazi University","Besevler","1935",10000,500,200);
        Department computerengineering=new Department("Computer Engineering", 200,200,100);
        Student karim=new Student("karim","elguermai","male","karimgreek@gmail.com","Morocco","single",21,"5052345323",13425423,3);
        Teacher sadik= new Teacher("sadik","cetin","male","sadik.cetin@esb.com","Turkiye","single",21,"5052345323",13425423,5);
        Personnel celalettin=new Personnel("celalettin","cello","male","celalettin@esb.com","Turkiye","single",25,"505234533","Mudur",16);
        Course math= new Course("Math","bm204",4);

        gaziuniversity.addDepartment(computerengineering);
        gaziuniversity.displayDepartment();
        gaziuniversity.deleteDepartment(computerengineering);
        gaziuniversity.displayDepartment();

        computerengineering.getClassAvailables().add("Mathematics");
        computerengineering.getClassAvailables().add("Physics");
        computerengineering.getClassAvailables().remove("Physics");
        computerengineering.addStudent(karim);
        System.out.println(computerengineering.getClassAvailables());


        computerengineering.addStudent(karim);
        computerengineering.deleteStudent(karim);
        computerengineering.addTeacher(sadik);
        computerengineering.addPersonnel(celalettin);
        System.out.println();

    }
}
