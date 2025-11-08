package sample;
import java.util.Scanner;
public class Exp_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] multiples = new int[10];
        int count = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 9 == 0) {
                multiples[count] = numbers[i];
                count++;
            }
        }

        System.out.print("The numbers that are multiples of both 9 and 3: ");
        for (int i = 0; i < count; i++) {
            System.out.print(multiples[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
