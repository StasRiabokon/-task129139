package student;


public class Student {

    private String firstName;
    private String lastName;
    private int id;
    private double gpa;
    
    public Student(String f, String l, int i, double g) {

        this.firstName = f;
        this.lastName = l;
        this.id = i;
        this.gpa = g;
    }

    public String getFirstName() {

        return firstName;

    }

    public void setFirstName(String f) {

        this.firstName = f;

    }

    public String getLastName() {

        return lastName;

    }

    public void setLastName(String l) {

        this.lastName = l;

    }

    public int getId() {

        return id;

    }

    public void setId(int i) {

        this.id = i;

    }

    public double getGpa() {

        return gpa;

    }

    public void setGpa(double g) {

        this.gpa = g;

    }

    public void displayStudent() {
        System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Id: " + this.getId());
        System.out.println("Gpa: " + this.getGpa());

    }

}
