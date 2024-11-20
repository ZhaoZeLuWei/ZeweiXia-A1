import java.util.ArrayList;
import java.time.LocalDateTime;

public class AssignmentOne {

    ArrayList<Appointment> appointments = new ArrayList<Appointment>();

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
    AssignmentOne appointmentPart5 = new AssignmentOne();
    appointmentPart5.creatAppointment("John", "15101636872", LocalDateTime.of(2024, 11, 20, 10, 30), Bob);
    appointmentPart5.creatAppointment("Danking", "15101636873", LocalDateTime.of(2024, 11, 20, 11, 30), Peter);
    appointmentPart5.printAllAppointments();
    }

    public void creatAppointment(String patientName, String patientPhoneNumber, LocalDateTime appointmentDateTime, HealthProfessional healthProfessional) {
        if (patientName == null || patientPhoneNumber == null || appointmentDateTime == null || healthProfessional == null) {
            System.err.println("Invalid input");
            return;
        }
        Appointment appointment = new Appointment(patientName, patientPhoneNumber, appointmentDateTime, healthProfessional);
        appointments.add(appointment);
        System.err.println("Appointment created successfully");
    }

    public void printAllAppointments() {
        if(appointments.isEmpty()) {
            System.out.println("No appointments available");
        } else {
            for(Appointment app : appointments) {
                System.out.println(app);
            }
        }
        
    }
}
