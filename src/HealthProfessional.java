public abstract class HealthProfessional {
    private int id;
    private String name;
    private int age;

    public HealthProfessional(int id, String name, int age) {
        if (id >= 0) {
            this.id = id;
        } else  {
            System.err.printf("Invalid ID: %d, id must be a number greater than or equal to 0", id);
            return;
        }

        if (name.length() > 0 && name != null) {
            this.name = name;
        } else {
            System.err.printf("Invalid name: %s, name must be a string with at least one character", name);
            return;
        }

        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.err.printf("Invalid age: %d, require an integer between 0 and 150", age);
            return;
        }
        
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
        if (inputId >= 0) {
            this.id = inputId;
        } else  {
            System.err.printf("Invalid ID: %d, id must be a number greater than or equal to 0", inputId);
            return;
        }
    }

    public void setName(String inputName) {
        if (name.length() > 0 && name != null) {
            this.name = inputName;
        } else {
            System.err.printf("Invalid name: %s, name must be a string with at least one character", inputName);
            return;
        }
    }
    
    public void setAge(int inputAge) {
        if (age > 0 && age < 150) {
            this.age = inputAge;
        } else {
            System.err.printf("Invalid age: %d, require an integer between 0 and 150", inputAge);
            return;
        }
    }

    @Override
    public String toString() {
        return  "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Age: " + age + "\n";
    }

}
