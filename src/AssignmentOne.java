import java.util.ArrayList;
public class AssignmentOne {
    public static void main(String[] args) {
    //Part3 - Using classes and objects 
    GeneralPractitioner Bob = new GeneralPractitioner(1001, "Bob", 25,"Men's Health");
    GeneralPractitioner Dannie = new GeneralPractitioner(1002,"Dannie", 30, "Pediatrics");
    GeneralPractitioner Nick = new GeneralPractitioner(1003, "Nick", 35, "Internal Medicine");  
    OtherHealthProfessional Peter = new OtherHealthProfessional(101, "Peter", 40, "Dentist");
    OtherHealthProfessional John = new OtherHealthProfessional(102, "John", 45, "Cardiology");
    System.out.println(Bob);
    System.out.println(Dannie);
    System.out.println(Nick);
    System.out.println(Peter);
    System.out.println(John);
    System.out.println("------------------------------");
    //Part 5 - Collection of appointments
    ArrayList<Appointment> appointments = new ArrayList<Appointment>();
    }
}
