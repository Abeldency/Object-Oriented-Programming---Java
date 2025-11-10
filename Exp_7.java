import java.util.*;

// Custom Exception for Invalid Employee ID
class InvalidEmpidException extends Exception {
    public InvalidEmpidException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Name
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

// Custom Exception for Invalid Age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Employee class
class Employee {
    int empid;
    String name;
    int age;

    public Employee(int empid, String name, int age) {
        this.empid = empid;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Exp_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            // Validation checks
            if (String.valueOf(empid).length() < 4) {
                throw new InvalidEmpidException("Employee ID must be at least 4 digits!");
            }

            if (isNumeric(name)) {
                throw new InvalidNameException("Employee name cannot be a number!");
            }

            if (age > 50) {
                throw new InvalidAgeException("Employee age cannot be greater than 50!");
            }

            // If all validations pass
            Employee e = new Employee(empid, name, age);
            e.display();

        } catch (InvalidEmpidException | InvalidNameException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input! Please try again.");
        } finally {
            sc.close();
        }
    }

    // Helper method to check if string is numeric
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
}

