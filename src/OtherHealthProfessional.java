public class OtherHealthProfessional extends HealthProfessional {
    private String otherSpecialization;
    private String doctorType = "Other Type Health Professional";

    public OtherHealthProfessional(int id, String name, int age, String otherSpecialization) {
        super(id, name, age);
        this.otherSpecialization = otherSpecialization;
    }

    public OtherHealthProfessional(){
        super();
        this.otherSpecialization = "Other type";
    }

    @Override
    public String toString() {
        return  "Doctor Type: " + doctorType + 
                "\nDetails are as follows\n" +
                super.toString() +
                "Specialization: " + otherSpecialization + "\n";
    }

    public String getOtherSpecialization() {
        return otherSpecialization;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setOtherSpecialization(String newSpecialization) {
        this.otherSpecialization = newSpecialization;
    }    

}