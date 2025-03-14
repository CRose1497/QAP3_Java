package problem1;

/**
 * Represents a student, which is a specialized type of Person.
 * A student has an ID number and a GPA.
 */
public class Student extends Person {
    private String myIdNum; // Student ID number
    private double myGPA;   // Grade Point Average

    /**
     * Constructor for creating a Student.
     * @param name - Student's name
     * @param age - Student's age
     * @param gender - Student's gender
     * @param idNum - Student ID
     * @param gpa - Student's GPA
     */
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // Calls the constructor of the Person class
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // Getters and setters
    public String getIdNum() { return myIdNum; }
    public void setIdNum(String idNum) { this.myIdNum = idNum; }

    public double getGPA() { return myGPA; }
    public void setGPA(double gpa) { this.myGPA = gpa; }

    /**
     * Returns a formatted string representation of the Student.
     */
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
