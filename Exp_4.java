import java.util.Scanner;
class FitnessTracker {
   String name;
   int age;
   double weight;
   double height; 
   int totalSteps;
   double totalCalories;


   FitnessTracker(String name, int age, double weight, double height, int totalSteps, double totalCalories) {
       this.name = name;
       this.age = age;
       this.weight = weight;
       this.height = height;
       this.totalSteps = totalSteps;
       this.totalCalories = totalCalories;
   }


   double calculateBMI() {
       double heightInMeters = height / 100;
       return weight / (heightInMeters * heightInMeters);
   }


   void updateSteps(int steps) {
       totalSteps += steps;
   }


   void updateCalories(double calories) {
       totalCalories += calories;
   }


   void displayDetails() {
       System.out.println("\n--- Personal Fitness Tracker Details ---");


       System.out.println("Name: " + name);


       System.out.println("Age: " + age);


       System.out.println("Weight (kg): " + weight);


       System.out.println("Height (cm): " + height);


       System.out.println("Total Steps: " + totalSteps);


       System.out.println("Total Calories Burned: " + totalCalories);


       System.out.printf("BMI: %.2f\n", calculateBMI());
   }
}


public class Exp_4 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


       System.out.print("Enter Name: ");
       String name = sc.nextLine();


       System.out.print("Enter Age: ");
       int age = sc.nextInt();


       System.out.print("Enter Weight (in kg): ");
       double weight = sc.nextDouble();


       System.out.print("Enter Height (in cm): ");
       double height = sc.nextDouble();


       System.out.print("Enter Total Steps Walked: ");
       int steps = sc.nextInt();


       System.out.print("Enter Total Calories Burned: ");
       double calories = sc.nextDouble();
      
       FitnessTracker user = new FitnessTracker(name, age, weight, height, steps, calories);
      
       System.out.print("\nEnter Additional Steps to Update: ");
       int newSteps = sc.nextInt();


       user.updateSteps(newSteps);
       System.out.print("Enter Additional Calories Burned: ");


       double newCalories = sc.nextDouble();
       user.updateCalories(newCalories);


       user.displayDetails();
       sc.close();
   }
}
