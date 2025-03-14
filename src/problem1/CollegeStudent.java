package problem1;

/**
 * Represents a college student, which is a specialized type of Student.
 * A college student has a major and a year of study.
 */
public class CollegeStudent extends Student {
    private String major; // The student's major
    private int year;     // The student's year (e.g. 1 = Freshman, 2 = Sophomore, etc.)

    /**
     * Constructor for creating a CollegeStudent.
     * @param name - Student's name
     * @param age - Student's age
     * @param gender - Student's gender
     * @param idNum - Student ID
     * @param gpa - Student's GPA
     * @param year - The year of college (1 = Freshman, etc.)
     * @param major - The student's field of study
     */
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Calls the constructor of the Student class
        this.year = year;
        this.major = major;
    }

    // Getters and setters
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    /**
     * Returns a formatted string representation of the CollegeStudent.
     */
    @Override
    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}
