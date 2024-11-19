public abstract class HealthProfessional {
    private int id;
    private String name;
    private int age;

    public HealthProfessional(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public HealthProfessional() {
        this.id = 0;
        this.name = "UnknownName";
        this.age = 0;
    }

    //public method to get the id
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int inputId) {
        this.id = inputId;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }
    
    public void setAge(int inputAge) {
        this.age = inputAge;
    }

    @Override
    public String toString() {
        return  "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n";
    }

}
