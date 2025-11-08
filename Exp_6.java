package sample;
import java.util.*;
 
abstract class Device { 
	int deviceId;
	String brand; 
	double price;

	Device(int deviceId, String brand, double price) { 
		this.deviceId = deviceId;
		this.brand = brand; 
		this.price = price;
	}

	abstract void displayDetails();
}

interface Discountable {
	void applyDiscount(double percentage); 
	double finalPrice();
}

class Smartphone extends Device implements Discountable { 
	private double discountedPrice;
	Smartphone(int deviceId, String brand, double price) { 
		super(deviceId, brand, price);
		this.discountedPrice = price; 
	}

	public void applyDiscount(double percentage) { 
		discountedPrice = price - (price * (percentage / 100));
		System.out.println("Discount of " + percentage + "% applied successfully!");
	}

	public double finalPrice() { 
		return discountedPrice;
	}

	void displayDetails() {
		System.out.println("----- Smartphone Details	");
		System.out.println("Device ID : " + deviceId); 
		System.out.println("Brand	: " + brand); 
		System.out.println("Original Price : " + price); 
		System.out.println("Final Price : " + discountedPrice);
	}
}

public class Exp_6 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		Smartphone phone = null;
		int choice;

		do {
			System.out.println("\n===== Smart Device Store Menu =====");

			System.out.println("1. Add Smartphone"); 
			System.out.println("2. Apply Discount"); 
			System.out.println("3. View Device Details"); 
			System.out.println("4. Exit"); 
			System.out.print("Enter your choice: "); 
			choice = sc.nextInt();
			switch (choice) { 
				case 1:
					System.out.print("Enter Device ID: "); 
					int id = sc.nextInt();
					sc.nextLine(); 
					System.out.print("Enter Brand Name: "); 
					String brand = sc.nextLine(); 
					System.out.print("Enter Price: ");
					double price = sc.nextDouble();
					phone = new Smartphone(id, brand, price); 
					System.out.println("Smartphone added successfully!"); 
					break;
				case 2:
					if (phone == null) {
						System.out.println("Please add a smartphone first!");
					} else {
						System.out.print("Enter discount percentage: "); 
						double percent = sc.nextDouble(); 
						phone.applyDiscount(percent);
					}
					break;

				case 3:
					if (phone == null) {
						System.out.println("No smartphone details found!");
					} else {
						phone.displayDetails();
					}
					break;
				case 4:
					System.out.println("Exiting Smart Device Store... Thank you!"); 
					break;
				default:
					System.out.println("Invalid choice! Please try again.");
			}
		} while (choice != 4);
		
		sc.close();
	}
}
