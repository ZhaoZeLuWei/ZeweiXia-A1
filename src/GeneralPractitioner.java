public class GeneralPractitioner extends HealthProfessional {
    private String doctorSpecialization;
    private String doctorType = "General Practitioner";

    public GeneralPractitioner(int id, String name, int age, String doctorSpecialization) {
        super(id, name, age);
        if(doctorSpecialization == null || doctorSpecialization.isEmpty()){
            throw new IllegalArgumentException("Doctor Specialization cannot be empty and must a string");
        }
        this.doctorSpecialization = doctorSpecialization;
    }

    public GeneralPractitioner(){
        super();
        this.doctorSpecialization = "General";
    }

    @Override
    public String toString() {
        return  "Doctor Type: " + doctorType + 
                "\nDetails are as follows\n" +
                super.toString() +
                "Specialization: " + doctorSpecialization + "\n";
    }
    
    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        if(doctorSpecialization == null || doctorSpecialization.isEmpty()){
            throw new IllegalArgumentException("Doctor Specialization cannot be empty and must a string");
        }
        this.doctorSpecialization = doctorSpecialization;
    }
                
 }

