import java.util.ArrayList;
import java.util.Iterator;
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
    appointmentPart5.creatAppointment("John", "15101636872", LocalDateTime.of(2025, 11, 20, 10, 30), Bob);
    appointmentPart5.creatAppointment("Danking", "15101636873", LocalDateTime.of(2025, 11, 20, 11, 30), Dannie);
    appointmentPart5.creatAppointment("Bobby", "15101636874", LocalDateTime.of(2025, 11, 20, 12, 30), Peter);
    appointmentPart5.creatAppointment("Bola", "15101636875", LocalDateTime.of(2025, 11, 20, 13, 30), John);
    appointmentPart5.printExistingAppointments();
    System.out.println("------------------------------");
    appointmentPart5.cancelBooking("15101636872");
    appointmentPart5.printExistingAppointments();
    System.out.println("------------------------------");
    }

    //由于 Java 支持多态性，任何 HealthProfessional 的子类对象都可以作为参数传入方法或构造函数，这样就无需额外的类型检查或分支逻辑来处理具体的子类。
    public void creatAppointment(String patientName, String patientPhoneNumber, LocalDateTime appointmentDateTime, HealthProfessional healthProfessional) {
        try {
            Appointment appointment = new Appointment(patientName, patientPhoneNumber, appointmentDateTime, healthProfessional);
        appointments.add(appointment);
        System.out.printf("Appointment for:%s created successfully\n", patientName);
        } catch (IllegalArgumentException e) {
            System.err.printf("\nAppointment for:%s creation failed, becasue of ", patientName);
            System.err.println(e.getMessage());
        }
        
    }

    public void printExistingAppointments() {
        if(appointments.isEmpty()) {
            System.out.println("No appointments available");
        } else {
            for(Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
        
    }

    public void cancelBooking(String patientPhoneNumber) {
        Iterator<Appointment> iterator = appointments.iterator();
        boolean hasFound = false;
        while(iterator.hasNext()) {
            Appointment appointment = iterator.next();
            if(appointment.getPhoneNumber().equals(patientPhoneNumber)) {
                iterator.remove();
                hasFound = true;
                System.out.printf("Appointment cancelled successfully: %s %s\n ", appointment.getPatientName(), patientPhoneNumber);
            }
        }
        if(!hasFound) {
            System.out.println("Appointment not found, delete failed");
        }
    }
}
