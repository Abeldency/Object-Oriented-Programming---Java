package sample;
import java.util.Scanner; 
public class Exp_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int[] original = new int[10];
		int[] odd = new int[10]; 
		int[] even = new int[10]; 
		int oddIndex = 0, evenIndex = 0;
		System.out.println("Enter 10 numbers:");
		for (int i = 0; i < 10; i++){
			original[i] = sc.nextInt();
			if (original[i] % 2 == 0){
				even[evenIndex++] = original[i] * original[i] * original[i];
			}
			else{
				odd[oddIndex++] = original[i] * original[i];
			}
		}
		System.out.print("Original Array: ");
		for (int i = 0; i < 10; i++){
			System.out.print(original[ i] + " ");
		}
		System.out.print("\nOdd Array: ");
		for (int i = 0; i < oddIndex; i++){
			System.out.print(odd[i] + " ");

		}
		System.out.print("\nEve n Array: ");
		for (int i = 0; i < evenIndex; i++){
			System.out.print(even[i] + " ");

		}
	}
}
