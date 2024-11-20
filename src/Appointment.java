import java.time.LocalDateTime;


public class Appointment {
    private String patientName;
    private String patientPhoneNumber;
    private LocalDateTime appointmentDateTime;
    //abstract class HealthProfessional
    private HealthProfessional healthProfessional;

    //constructor with data validations
    public Appointment(String patientName, String patientPhoneNumber, LocalDateTime appointmentDateTime, HealthProfessional healthProfessional) {
        if (patientName.length() > 0 ) {
            this.patientName = patientName;
        } else {
            System.err.printf("Invalid patient name: %s, name must be a string with at least one character", patientName);
            throw new IllegalArgumentException("Invalid patient name: " + patientName);
        }
        
        if (patientPhoneNumber.length() > 5 && patientPhoneNumber.length() < 15) {
            this.patientPhoneNumber = patientPhoneNumber;
        } else {
            System.err.printf("Invalid phone number: %s, phone number must be a string with at least one character", patientPhoneNumber);
            throw new IllegalArgumentException("Invalid phone number: " + patientPhoneNumber);
        }

        if(appointmentDateTime.isBefore(LocalDateTime.now())) {
            System.err.println("Invalid appointment date and time, appointment date and time must be in the future");
            throw new IllegalArgumentException("Invalid appointment date and time: " + appointmentDateTime);
        } else {
        this.appointmentDateTime = appointmentDateTime;
        }

        if (healthProfessional instanceof HealthProfessional) {
            this.healthProfessional = healthProfessional;
        } else {
            System.err.println("Input object is not an instance of HealthProfessional");
            throw new IllegalArgumentException("Input object is not an instance of HealthProfessional");
        }
        
    }
    
    //defalut constructor if losing input data
    public Appointment() {
        this.patientName = "No Name";
        this.patientPhoneNumber = "No Phone Number";
        this.appointmentDateTime = LocalDateTime.now();
        this.healthProfessional = null;
    }

    //getters
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

    //setters with data validations
    public void setPatientName(String newName) {
        if (patientName.length() > 0 ) {
            this.patientName = newName;
        } else {
            System.err.printf("Invalid patient name: %s, name must be a string with at least one character", newName);
        }
    }

    public void setPhoneNumber(String newNumber) {
        if (patientPhoneNumber.length() > 5 && patientPhoneNumber.length() < 15) {
            this.patientPhoneNumber = newNumber;
        } else {
            System.err.printf("Invalid phone number: %s, phone number must be a string with at least one character", newNumber);
        }
    }

    public void setDateTime(LocalDateTime newDateTime) {
        if(newDateTime.isBefore(LocalDateTime.now())) {
            System.err.println("Invalid appointment date and time, appointment date and time must be in the future");
        } else {
        this.appointmentDateTime = newDateTime;
        }
    }

    public void setHealthProfessional(HealthProfessional newHealthProfessional) {
        if (newHealthProfessional instanceof HealthProfessional) {
            this.healthProfessional = newHealthProfessional;
        } else {
            System.err.println("Input object is not an instance of HealthProfessional");
        }
    }

    //toString methods to print the details of the appointment
    public String toString() {
        return "Patient Name: " + patientName + "\n" +
               "Patient Phone Number: " + patientPhoneNumber + "\n" +
               "Appointment Date and Time: " + appointmentDateTime + "\n" +
               healthProfessional.toString() + "\n";
    }
    
}
