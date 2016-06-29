package Proje;

/**
 * Created by karim on 27.06.2016.
 */
public class Personnel extends PersonalInformation{

   private String duty;
   private int workingHours;

    public String getDuty() {
        return duty;
    }
    public void setDuty(String duty) {
        this.duty = duty;
    }
    public int getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }


    public Personnel(String name, String surname, String gender, String email, String nationality, String marialStatues, int age, String cellNumber, String duty, int workingHours) {
        super(name, surname, gender, email, nationality, marialStatues, age, cellNumber);
        setDuty(duty);
        setWorkingHours(workingHours);
    }


}
