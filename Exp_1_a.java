import java.util.Scanner;
public class Exp_1_a {
    public static void main(String[] args) {
        int ticket = 200;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = s.nextInt();

        System.out.print("Enter the Day of Booking (1=Mon ... 7=Sun): ");
        int day = s.nextInt();

        double price = ticket; // base ticket price

        // Age-based discount
        if (age < 5) {
            System.out.println("The Ticket is Free");
            price = 0;
        } 
        else if (age >= 5 && age <= 18) {
            System.out.println("You are eligible for 40% discount");
            price = ticket - (0.4 * ticket);
        } 
        else if (age > 60) {
            System.out.println("You are eligible for 30% discount");
            price = ticket - (0.3 * ticket);
        } 
        else {
            System.out.println("No age-based discount applied.");
        }

        // Day-based discount (Mon–Fri)
        if (day >= 1 && day <= 5) {
            System.out.println("Weekday booking — eligible for 10% discount.");
            price = price - (0.1 * price);
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend booking — no additional discount.");
        } else {
            System.out.println("Invalid day entered! Please enter between 1 and 7.");
        }

        System.out.println("Final Ticket Price: " + price);
        s.close();
    }
}
