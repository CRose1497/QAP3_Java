package problem1;

/**
 * A simple demo class to test all the Person-related classes.
 */
public class Demo {
    public static void main(String[] args) {
        // Creating a basic Person
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob); // Expected output: "Coach Bob, age: 27, gender: M"

        // Creating a Student
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne); // Expected output: "Lynne Brooke, age: 16, gender: F, ID: HS95129, GPA: 3.5"

        // Creating a Teacher
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava); // Expected output: "Duke Java, age: 34, gender: M, Subject: Computer Science, Salary: $50000"

        // Creating a CollegeStudent
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima); // Expected output: "Ima Frosh, age: 18, gender: F, ID: UCB123, GPA: 4.0, Year: 1, Major: English"
    }
}
