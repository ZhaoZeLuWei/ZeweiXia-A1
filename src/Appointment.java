import java.time.LocalDateTime;


public class Appointment {
    private String patientName;
    private String patientPhoneNumber;
    private LocalDateTime appointmentDateTime;
    //abstract class HealthProfessional
    private HealthProfessional healthProfessional;

    public Appointment(String patientName, String patientPhoneNumber, LocalDateTime appointmentDateTime, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientPhoneNumber = patientPhoneNumber;
        this.appointmentDateTime = appointmentDateTime;
        this.healthProfessional = healthProfessional;
    }

    public Appointment() {
        this.patientName = "No Name";
        this.patientPhoneNumber = "No Phone Number";
        this.appointmentDateTime = LocalDateTime.now();
        this.healthProfessional = null;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPhoneNumber() {
        return patientPhoneNumber;
    }

    public LocalDateTime getDateTime() {
        return appointmentDateTime;
    }

    public HealthProfessional getHealthProfessional() {
        return healthProfessional;
    }

    public void setPatientName(String newName) {
        this.patientName = newName;
    }

    public void setPhoneNumber(String newNumber) {
        this.patientPhoneNumber = newNumber;
    }

    public void setDateTime(LocalDateTime newDateTime) {
        this.appointmentDateTime = newDateTime;
    }

    public void setHealthProfessional(HealthProfessional newHealthProfessional) {
        this.healthProfessional = newHealthProfessional;
    }

    public String toString() {
        return "Patient Name: " + patientName + "\n" +
               "Patient Phone Number: " + patientPhoneNumber + "\n" +
               "Appointment Date and Time: " + appointmentDateTime + "\n" +
               healthProfessional.toString() + "\n";
    }
    
}
