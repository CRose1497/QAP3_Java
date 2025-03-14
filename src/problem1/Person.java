package problem1;

/**
 * Represents a basic person with a name, age, and gender.
 * This will serve as the base class for other types of people.
 */
public class Person {
    // Instance variables (Protected so subclasses can access them)
    protected String myName;
    protected int myAge;
    protected String myGender;

    /**
     * Constructor for creating a Person.
     * @param name - The name of the person
     * @param age - The person's age
     * @param gender - The person's gender ("M" for Male, "F" for Female)
     */
    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    // Getter and Setter Methods for encapsulation
    public String getName() { return myName; }
    public void setName(String name) { this.myName = name; }

    public int getAge() { return myAge; }
    public void setAge(int age) { this.myAge = age; }

    public String getGender() { return myGender; }
    public void setGender(String gender) { this.myGender = gender; }

    /**
     * Returns a formatted string representation of the Person.
     */
    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}
