import java.util.Scanner;

// Superclass: Cake
class Cake {
    String name;
    double price;

    public Cake(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to be overridden
    public double calculatePrice() {
        return price;
    }

    public void display() {
        System.out.println("Cake Name: " + name);
        System.out.println("Base Price: " + price);
    }
}

// Subclass 1: OrderCake (based on weight)
class OrderCake extends Cake {
    double weight; // in kilograms

    public OrderCake(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    public double calculatePrice() {
        return price * weight; // price per kg × weight
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Total Price: " + calculatePrice());
    }
}

// Subclass 2: ReadyMadeCake (based on quantity)
class ReadyMadeCake extends Cake {
    int quantity; // number of pieces

    public ReadyMadeCake(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    @Override
    public double calculatePrice() {
        return price * quantity; // price per piece × quantity
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculatePrice());
    }
}

// Main class
public class Exp_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Cake cake = null;

        do {
            System.out.println("\n===== Cake Menu =====");
            System.out.println("1. Order Cake (by weight)");
            System.out.println("2. Ready Made Cake (by quantity)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Cake Name: ");
                    String name1 = sc.nextLine(); // allows multi-word names
                    System.out.print("Enter Price per Kg: ");
                    double price1 = sc.nextDouble();
                    System.out.print("Enter Weight (kg): ");
                    double weight = sc.nextDouble();

                    cake = new OrderCake(name1, price1, weight);
                    cake.display();
                    break;

                case 2:
                    System.out.print("Enter Cake Name: ");
                    String name2 = sc.nextLine(); // allows multi-word names
                    System.out.print("Enter Price per Piece: ");
                    double price2 = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    cake = new ReadyMadeCake(name2, price2, qty);
                    cake.display();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
