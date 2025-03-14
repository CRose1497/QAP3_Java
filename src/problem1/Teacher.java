package problem1;

/**
 * Represents a Teacher, which is a type of Person.
 * A teacher has a subject they teach and a salary.
 */
public class Teacher extends Person {
    private String subject; // The subject the teacher teaches
    private double salary;  // The teacher's annual salary

    /**
     * Constructor for creating a Teacher.
     * @param name - Teacher's name
     * @param age - Teacher's age
     * @param gender - Teacher's gender
     * @param subject - Subject taught
     * @param salary - Annual salary of the teacher
     */
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); // Calls the constructor of the Person class
        this.subject = subject;
        this.salary = salary;
    }

    // Getters and setters
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    /**
     * Returns a formatted string representation of the Teacher.
     */
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: $" + salary;
    }
}
