public class Student {
    // Instance variables
    int rollNo;
    String studentName;
    
    // Static variable (shared among all objects)
    static String collegeName = "KPRIET"; 

    // Constructor to initialize instance variables
    public Student(int r, String name) {
        this.rollNo = r;     
        this.studentName = name;   
    }

    // Static method to update the shared college name
    public static void changeCollege(String newCollege) {
        collegeName = newCollege; 
    }

    // Instance method to display student information
    public void display() {
        System.out.println("Roll No: " + this.rollNo + " | Name: " + this.studentName + " | College: " + collegeName);
    }

    public static void main(String[] args) {
        // 1. Create student objects
        Student s1 = new Student(101, "Siva");
        Student s2 = new Student(102, "Geetha");
        Student s3 = new Student(103, "Arun");

        // 2. Demonstration of Static Variables
        System.out.println("--- Initial Student Details ---");
        s1.display();
        s2.display();
        s3.display();

        // Direct modification of static variable
        Student.collegeName = "PSG";
        System.out.println("\n--- After Direct Static Variable Modification ---");
        s1.display();
        s2.display();
        s3.display();

        // 3. Demonstration of Static Method
        // Updating static variable via the static method
        Student.changeCollege("KPR University");
        System.out.println("\n--- After Using Static Method ---");
        s1.display();
        s2.display();
        s3.display();
    }
}
