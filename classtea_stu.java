// Person class with id and name fields
class Person {
    private int id;
    private String name;

    // Constructor to initialize id and name
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // toString method for printing the object details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

// Teacher class extends Person and adds a subject field
class Teacher extends Person {
    private String subject;

    // Constructor to initialize id, name, and subject
    public Teacher(int id, String name, String subject) {
        super(id, name);  // Call the parent class constructor
        this.subject = subject;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Override toString to include subject
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}

// Student class extends Person and adds a grade field
class Student extends Person {
    private String grade;

    // Constructor to initialize id, name, and grade
    public Student(int id, String name, String grade) {
        super(id, name);  // Call the parent class constructor
        this.grade = grade;
    }

    // Getter for grade
    public String getGrade() {
        return grade;
    }

    // Override toString to include grade
    @Override
    public String toString() {
        return super.toString() + ", Grade: " + grade;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Teacher and Student
        Teacher teacher = new Teacher(1, "Aakash Mane", "AT");
        Student student = new Student(2, "Abhijeet Nimbalkar", "A");

        // Print the objects
        System.out.println(teacher);  // Output: ID: 1, Name: Aakash Mane, Subject: Math
        System.out.println(student);  // Output: ID: 2, Name: Abhijeet Nimbalkar, Grade: A
    }
}
